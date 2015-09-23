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
public class MenuController extends JFrame
{
    final int SCREEN_WIDTH = 1200;
    final int SCREEN_HEIGHT = 800;
    
    //private MenuUI mainMenu;
    private GameScreen gameScreen;
    
    public MenuController()
    {
        setup();
    }
    
    public void setup()
    {
        setSize(1200, 800);
        setBackground(Color.BLACK);
        setTitle("Classroom Defense");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
