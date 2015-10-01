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
import javax.swing.*;


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
    JButton btnGameStart = new JButton();
    JButton btnEasy = new JButton("Easy");
    JButton btnMedium = new JButton("Medium");
    JButton btnHard = new JButton("Hard");
    JButton btnHighscore = new JButton("Highscore");
    JButton btnLVL1 = new JButton("Level 1");
    JButton btnLVL2 = new JButton("Level 2");
    JButton btnLVL3 = new JButton("Level 3");
    //Text Input Area
    JTextField nameID = new JTextField("");
    String userNameID;
    //Text Fields
   JLabel name = new JLabel("Enter username: "); 
   JLabel instructions = new JLabel("<html>1. Enter yur user name <br> 2.Select difficulity/Level <br> 3.click Start Game</html>");
    
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
  
        

    
    setLayout(null);
    //Buttons
ImageIcon imageRon = new ImageIcon("images/1211792790.png");
//creates the image to be used in a JButton
btnGameStart = new JButton(imageRon); //JButton created with an image
btnGameStart = new JButton();
btnGameStart.setIcon(imageRon);// image added after the button is already created
   add(btnGameStart);
   btnGameStart.setBounds(150,700,100,50);
   add(btnEasy);
   btnEasy.setBounds(250,700,100,50);
   add(btnMedium);
   btnMedium.setBounds(350,700,100,50);
   add(btnHard);
   btnHard.setBounds(450,700,100,50);
   //Text Input Area
   add(name);
   name.setBounds(570,700,100,50);
   add(nameID);
   nameID.setBounds(670,700,200,50);
   //TextField
   add(instructions);
   instructions.setBounds(900,700,200,50);
   
  
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
                    setVisible(false);
                    MenuController.dispose();
                    GameScreen gs = new GameScreen();
                    gs.setVisible(true);
                    
                    
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
               
           URL imagePath = this.getClass().getResource("images/MainMenu.png");
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