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
 * @author asl5257
 */
public class GameScreenController extends JFrame
{
    private GameScreen gs;
    
    public GameScreenController()
    {
        setSize(1200, 800);
        setBackground(Color.BLACK);
        setTitle("Classroom Defense");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        showGameScreenController();
        
        setVisible(true);
        
        pack();
    }
    
    public void showGameScreenController()
    {
        gs = new GameScreen();
        gs.setVisible(true);
    }
    
    public void setScreenVisible(boolean visibleState)
    {
        gs.setVisible(visibleState);
    }
    
    
}
