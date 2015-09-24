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
    protected JPanel menu;
    protected JPanel board;
    protected JPanel info;
    
    public GameScreenController()
    {
        GridLayout gl = new GridLayout(2, 1);
        setLayout(gl);
        setSize(1200, 800);
        setBackground(Color.BLACK);
        setTitle("Classroom Defense");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
        
    }
    
    public void showGameScreenController()
    {
        gs = new GameScreen();
        gs.setVisible(true);
        add(gs);
    }
    
    public void setScreenVisible(boolean visibleState)
    {
        gs.setVisible(visibleState);
    }
    
    
}
