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
    JPanel pnlButton = new JPanel();
    // Buttons
    JButton btnGameStart = new JButton("Start Game");
    JButton btnEasy = new JButton("Easy");
    JButton btnMedium = new JButton("Medium");
    JButton btnHard = new JButton("Hard");
    JTextArea nameID = new JTextArea("Your Name");
    String userNameID;
  public MenuUI() {
   
   pnlButton.add(btnGameStart, BorderLayout.SOUTH);
   pnlButton.add(btnEasy,BorderLayout.SOUTH);
   pnlButton.add(btnMedium, BorderLayout.SOUTH);
   pnlButton.add(nameID, BorderLayout.CENTER);
   add(btnHard);
   add(pnlButton);
   
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


