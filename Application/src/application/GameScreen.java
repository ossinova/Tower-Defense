/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
/**
 *
 * @author OssiNova
 */
public class GameScreen extends GameScreenController 
{
    private Player player;
    private Level level;
    private TurretListView tlv;
    
    JButton pauseButton;
    JButton newWave;
    JButton sellButton;
    JButton moveButton;
    
    String userName, health, money, score, levelName;
    
    public GameScreen() 
    {
        super();
        player = new Player();
        buttonSetup();
        setVisible(true);
    }
    
    public void buttonSetup()
    {
        JButton pauseButton = new JButton("Pause");
          add(pauseButton);
        JButton newWave = new JButton("New Wave");
          add(newWave);
        JButton sellButton = new JButton("Sell Turret");
          add(sellButton);
        JButton moveButton = new JButton("Move Turret");
          add(moveButton);
    }
    
    public void getUserInfo()
    {
        userName = player.getName();
        health = Integer.toString(player.getHealth());
        money = Integer.toString(player.getMoney());
        score = Integer.toString(player.getScore());
        levelName = level.getLevelName();
    }
    
    public void diplaySetup()
    {
        
    }
    
    public void paintComponents(Graphics g)
    {
        
    }
}
     

