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
    
    public GameScreen() {
        // Game Start button setbounds
        btnGameStart.setBounds(60, 400, 220, 30);

        // JPanel bounds
        pnlButton.setBounds(800, 800, 200, 100);

        // Adding to JFrame
        pnlButton.add(btnGameStart);
        pnlButton.add(btnEasy);
        pnlButton.add(btnMedium);
        pnlButton.add(btnHard);
        pnlButton.add(btnPause);
        pnlButton.add(btnNewWave);
        add(pnlButton);

        // JFrame properties
        setSize(400, 400);
        setBackground(Color.BLACK);
        setTitle("Classroom Defense");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameScreen();
    }
}
    

