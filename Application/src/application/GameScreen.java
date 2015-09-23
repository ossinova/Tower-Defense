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
public class GameScreen extends JPanel 
{
    JButton pauseButton;
    JButton newWave;
    JButton sellButton;
    JButton moveButton;
    
    public GameScreen() 
    {
        super();
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
}
     

