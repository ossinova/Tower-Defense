/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author OssiNova
 */
public class GameScreen extends JFrame //implements ActionListener
{
    private Player player;
    private Level level;
    private TurretListView turretList;
    
    JButton pauseButton;
    JButton newWave;
    JButton sellButton;
    JButton moveButton;
    
    JLabel nameLabel;
    JLabel healthLabel;
    JLabel moneyLabel;
    JLabel scoreLabel;
    JLabel levelLabel;
    
    JPanel menu;
    JPanel display;
    JPanel board;
    
    
    String userName, health, money, score, levelName;
    
    public GameScreen() 
    {
        super();
        //GridLayout gl = new GridLayout(3, 1, 10, 10);
        //setLayout(gl);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        
        player = new Player();
        level = new Level();
        
        buttonSetup();
        userDisplaySetup();
        boardSetup();
        
        setSize(1200, 800);
        //setResizable(false);
        setTitle("Classroom Defense");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        add(board, BorderLayout.CENTER);
        add(menu, BorderLayout. NORTH);
        add(display, BorderLayout.SOUTH);
    }
    
    public void buttonSetup()
    {
        menu = new JPanel();
        
        pauseButton = new JButton("Pause");
          menu.add(pauseButton);
        newWave = new JButton("New Wave");
          menu.add(newWave);
        sellButton = new JButton("Sell Turret");
         menu.add(sellButton);
        moveButton = new JButton("Move Turret");
         menu.add(moveButton);
    }
    
    
    public void userDisplaySetup()
    {
        display = new JPanel();
        display.setSize(300, 100);
        GridLayout gl= new GridLayout(2, 3);
        display.setLayout(gl);
        
        health = Integer.toString(player.getHealth());
        money = Integer.toString(player.getMoney());
        score = Integer.toString(player.getScore());
        levelName = level.getLevelName();
        userName = player.getName();
        
        nameLabel = new JLabel(userName);
         display.add(nameLabel);
        healthLabel = new JLabel(health);
          display.add(healthLabel);
        moneyLabel = new JLabel(money);
          display.add(moneyLabel);
        scoreLabel = new JLabel(score);
          display.add(scoreLabel);
        levelLabel = new JLabel(levelName);
          display.add(levelLabel);
    }
    
    public void boardSetup()
    {
        int width = 600;
        int height = 600;
        board = new JPanel();
        board.setSize(width, height);

        for(int x = 0; x < width; x++)
        {
            for(int y = 0; y < height; y++)
            {
                if(x % 10 == 0 && y % 10 ==0)
                {
                    JButton btn = new JButton();
                    board.add(btn);
                }
            }
        }
    }
    
    public void placeTurret(Turret t)
    {
        
    }
    
    public void loadLevel()
    {
        
    }
    
    public void diplaySetup()
    {
        
    }
}
     

