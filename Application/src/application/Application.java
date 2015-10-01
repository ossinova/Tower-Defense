/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author asl5257
 */
public class Application 
{
    public static void main(String[] args)
    {
        Application game = new Application();
    }
    
    public Application()
    {
        MenuController mc = new MenuController();
        GameScreenController gsc = new GameScreenController();
    }
}
