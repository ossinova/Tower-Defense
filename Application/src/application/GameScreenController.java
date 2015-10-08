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
    
    public GameScreenController(Player p)
    {
        setSize(1200, 800);
        setLayout(null);
        setTitle("Classroom Defense");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        gs = new GameScreen(p) {};
        //gs.setBounds(0,0, 1200, 800);
        add(gs);
        
        setVisible(true);
        
    }
    
    public void showGameScreenController()
    {
        //gs = new GameScreen();
        gs.setVisible(true);
    }
    
    public void setScreenVisible(boolean visibleState)
    {
        gs.setVisible(visibleState);
    }
    
    public GameScreen getGameScreen()
    {
        return gs;
    }
    
}
