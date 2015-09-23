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
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
/**
 *
 * @author OssiNova
 */
public class GameScreen extends JFrame {
    
   // JPanel
    JPanel pnlButton = new JPanel();
    // Buttons
    JButton btnGameStart = new JButton("Start Game");
    JButton btnEasy = new JButton("Easy");
    JButton btnMedium = new JButton("Medium");
    JButton btnHard = new JButton("Hard");
    JButton btnPause = new JButton("Pause");
    JButton btnNewWave = new JButton("New Wave");
    private boolean isInMenu = true;
    private Image menuImage = null;
    private Thread runThread;
    
    public GameScreen() {
      
        // Adding to JFrame
        pnlButton.add(btnGameStart);
        pnlButton.add(btnEasy);
        pnlButton.add(btnMedium);
        pnlButton.add(btnHard);
        pnlButton.add(btnPause);
        pnlButton.add(btnNewWave);
        add(pnlButton);

        // JFrame properties
        setSize(1200, 800);
        setBackground(Color.BLACK);
        setTitle("Classroom Defense");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
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
           
    public void DrawMenu(Graphics g){
        if (this.menuImage == null) 
            {
      
        try {
            URL imagePath = this.getClass().getResource("MainMenu.png");
            this.menuImage = Toolkit.getDefaultToolkit().getImage(imagePath);
        }
        catch (Exception e) {
            //image does not exist
            e.printStackTrace();
        }
         }
        g.drawImage(menuImage, 0, 0, 1200, 800, this);
    }
        
    public static void main(String[] args) {
       
        new GameScreen();
        
    }
}
     

