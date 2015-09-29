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
public class GameScreen extends JPanel //implements ActionListener
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
        GridLayout gl = new GridLayout(2, 1);
        setLayout(gl);
        
        player = new Player();
        level = new Level();
        
        buttonSetup();
        userDisplaySetup();
        
        add(menu);
        add(display);
        
        setVisible(true);
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
        
        userName = player.getName();
        health = Integer.toString(player.getHealth());
        money = Integer.toString(player.getMoney());
        score = Integer.toString(player.getScore());
        levelName = level.getLevelName();
        
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
        board = new JPanel();
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
    
    public void paintComponents(Graphics g)
    {
        
    }
}
     

