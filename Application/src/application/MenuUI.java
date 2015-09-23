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
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ocd5012
 */
public class MenuUI extends JPanel implements ActionListener{
   
    private Image menuImage = null;
    private boolean isInMenu = true;
    // JPanel
    JPanel pnl = new JPanel();
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
    JTextArea nameID = new JTextArea("Your Name");
    String userNameID;
    //Text Field
    JTextField instructions = new JTextField("Enter name, Select difficulity/Level and click Start Game");
  public MenuUI() {
   //Buttons
   pnl.add(btnGameStart, BorderLayout.SOUTH);
   pnl.add(btnEasy,BorderLayout.SOUTH);
   pnl.add(btnMedium, BorderLayout.SOUTH);
   pnl.add(btnHard, BorderLayout.SOUTH);
   //Text Input Area
   pnl.add(nameID, BorderLayout.CENTER);
   //TextField
   pnl.add(instructions, BorderLayout.EAST);
   add(pnl);
   
   nameID.setBackground(Color.BLUE);
   nameID.setForeground(Color.WHITE);
   
   
  }
   public void actionPerformed(ActionEvent e) {
                userNameID = nameID.getText(); 
                nameID.setText("");
        }
  
public void paint(Graphics g) { 
     
        
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

public void DrawMenu(Graphics g) {

        if (this.menuImage == null) {

            try {
               
           URL imagePath = this.getClass().getResource("MainMenu.png");
           this.menuImage = Toolkit.getDefaultToolkit().getImage(imagePath);
            } catch (Exception e) {
                //image does not exist
                e.printStackTrace();
            }
        }
        g.drawImage(menuImage, 0, 0, 1200, 800, this);
    }

}


