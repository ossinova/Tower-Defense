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

        setLayout(null);
        
        player = new Player();
        level = new Level();
        
        buttonSetup();
        userDisplaySetup();
        boardSetup();
        
        setSize(1200, 800);
        setResizable(false);
        setTitle("Classroom Defense");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        board.setBounds(0, 40, 720, 720);
        menu.setBounds(0, 0, 1200, 40);
        display.setBounds(720, 20, 300, 600);
        add(board);
        add(menu);
        add(display);
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
        GridLayout gl= new GridLayout(5, 1);
        display.setLayout(gl);
        
        Font f = new Font("Impact", Font.BOLD, 40);
        
        health = Integer.toString(player.getHealth());
        money = Integer.toString(player.getMoney());
        score = Integer.toString(player.getScore());
        levelName = level.getLevelName();
        userName = player.getName();
        
        nameLabel = new JLabel("Name: "+userName);
          nameLabel.setFont(f);
         display.add(nameLabel);
        healthLabel = new JLabel("HP: "+health);
          healthLabel.setFont(f);
          display.add(healthLabel);
        moneyLabel = new JLabel("Money: "+money);
          moneyLabel.setFont(f);
          display.add(moneyLabel);
        scoreLabel = new JLabel("Score: "+score);
          scoreLabel.setFont(f);
          display.add(scoreLabel);
        levelLabel = new JLabel(levelName);
          levelLabel.setFont(f);
          display.add(levelLabel);
    }
    
    public void boardSetup()
    {
        int width = 720;
        int height = 720;
        board = new JPanel();
        board.setSize(width, height);
        //board.setBackground();
        board.setLayout(null);

        for(int x = 0; x < width; x++)
        {
            for(int y = 0; y < height; y++)
            {
                if(x % 60 == 0 && y % 60 ==0)
                {
                    JButton btn = new JButton();
                    btn.setBounds(x, y, 60, 60);
                    btn.setBackground(new Color(255,255,255));
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
     

