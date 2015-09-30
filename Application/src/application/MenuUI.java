/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ocd5012
 */
public class MenuUI extends JPanel implements ActionListener{
   
    private Image menuImage = null;
    private Image highScoreImage = null;
    private boolean isInMenu = true;
    // JPanel
    
    
    // Buttons
    JButton btnGameStart = new JButton("Start Game");
    JButton btnEasy = new JButton("Easy");
    JButton btnMedium = new JButton("Medium");
    JButton btnHard = new JButton("Hard");
    JButton btnHighscore = new JButton("Highscore");
    JButton btnLVL1 = new JButton("Level 1");
    JButton btnLVL2 = new JButton("Level 2");
    JButton btnLVL3 = new JButton("Level 3");
    //Text Input Area
    JTextField nameID = new JTextField("Enter username:");
    String userNameID;
    //Text Field
   JLabel instructions = new JLabel("1. Enter yur user name 2.Select difficulity/Level 3.click Start Game");
    
   boolean userNameEntered = false;
    //TextFile for high score
     File f = null;
     String fileToRead = "hs.txt"; //high scores text file
     URL url = null;
     
     @Override
  public void paintComponents(Graphics g) { 
     
        
        if (isInMenu)
        { 
            //draw menu
            DrawMenu(g);
            
        }
      else
          {
              //draw everything else
           
          }
    } 
     
     
     
     public MenuUI() {
  
    GridLayout bl = new GridLayout(3, 1);
    setLayout(bl);
    //Buttons
   add(btnGameStart);
   add(btnEasy);
   add(btnMedium);
   add(btnHard);
   //Text Input Area
   add(nameID);
   //TextField
   add(instructions);
   
  
  nameID.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
         
       
          userNameID = nameID.getText(); 
          System.out.print("Username: " + userNameID);
          
          userNameEntered = true;
          Player userName = new Player(nameID.getText());
          
                
                
         
   }
    
  });
  
 btnGameStart.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
                
                
                
             //Is username entered?    
                
              if (userNameEntered == true) {
                  //If yes, open GameScreen
                    GameScreen gs = new GameScreen();
                    gs.setVisible(true);
                    setVisible(false);
                    
                }
                else {
                  //If no, give a warning
                     JOptionPane.showMessageDialog(null, "Please enter a username!", "EMPTY USERNAME" ,JOptionPane.WARNING_MESSAGE);
                     
                }
                
      
        }
   

   
  });
  
}


public void DrawMenu(Graphics g) {
            try {
               
           URL imagePath = this.getClass().getResource("MainMenu.png");
           this.menuImage = Toolkit.getDefaultToolkit().getImage(imagePath);
            } 
            catch (Exception e) {
                //image does not exist
                e.printStackTrace();
            }
        
        g.drawImage(menuImage, 0, 0, 1200, 800, this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}