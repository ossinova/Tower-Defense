/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 *
 * @author ocd5012
 */
public class MenuUI extends JPanel implements ActionListener{
   
    private Image menuImage;
    private Image highScoreImage = null;
    private boolean isInMenu = true;
    
    private Player p;
    // JPanel
    
    
    // Buttons
    JButton btnGameStart = new JButton();
    JButton btnEasy = new JButton("Easy");
    JButton btnMedium = new JButton("Medium");
    JButton btnHard = new JButton("Hard");
    JButton btnHighscore = new JButton("Highscore");
    JButton btnLVL1 = new JButton("Level 1");
    JButton btnLVL2 = new JButton("Level 2");
    JButton btnLVL3 = new JButton("Level 3");
    JButton btnICON = new JButton();
    //Text Input Area
    JTextField nameID = new JTextField("");
    String userNameID;
    //Text Fields
   JLabel name = new JLabel("Enter username: "); 
   JLabel instructions = new JLabel("<html>1. Enter yur user name <br> 2.Select difficulity/Level <br> 3.click Start Game</html>");
    JLabel logo = new JLabel("Class Room Defense");
   boolean userNameEntered = false;
    //TextFile for high score
     File f = null;
     String fileToRead = "hs.txt"; //high scores text file
     URL url = null;
     
     
     public MenuUI() {
  
    Font j = new Font("Impact", Font.BOLD, 70);

    
    setLayout(null);
    //Buttons


 try {
    Image img = ImageIO.read(getClass().getResource("images/play2.png"));
    btnGameStart.setIcon(new ImageIcon(img));
    btnGameStart.setBorderPainted(false);
    btnGameStart.setFocusPainted(false);
    btnGameStart.setContentAreaFilled(false);
    
  } catch (IOException ex) {
  }
  try {
    Image img2 = ImageIO.read(getClass().getResource("images/logo.png"));
    btnICON.setIcon(new ImageIcon(img2));
    btnICON.setBorderPainted(false);
    btnICON.setFocusPainted(false);
    btnICON.setContentAreaFilled(false);
    
  } catch (IOException ex) {
  }

   add(btnGameStart);
   btnGameStart.setBounds(50,650,100,100);
   add(btnEasy);
   btnEasy.setBounds(250,700,100,50);
   add(btnMedium);
   btnMedium.setBounds(350,700,100,50);
   add(btnHard);
   btnHard.setBounds(450,700,100,50);
   add(btnICON);
   btnICON.setBounds(45,45,1100,600);
   
   //Text Input Area
   add(name);
   name.setBounds(570,700,100,50);
   add(nameID);
   nameID.setBounds(670,700,200,50);
   //TextField
   add(instructions);
   instructions.setBounds(900,700,200,50);
   add(logo);
   logo.setFont(j);
   logo.setBounds(250, 50, 1250, 150);
   logo.setForeground(Color.RED);
  nameID.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
         
          p = new Player();
          p.setName(nameID.getText());
          userNameID = nameID.getText(); 
          System.out.print("Username: " + userNameID);
          
          userNameEntered = true;
          
          
                
                
         
   }
    
  });
  
 btnGameStart.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
                
                
                
             //Is username entered?    
                
              if (userNameEntered == true) {
                  //If yes, open GameScreen
                    
                   setVisible(false); 
                    
                }
                else {
                  //If no, give a warning
                   String warning;
                   warning = "Please input name";
                   JOptionPane.showMessageDialog(null, warning); 
                }
                
            
        }
   

   
  });
  
}



    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Player getPlayer()
    {
        return p;
    }
}