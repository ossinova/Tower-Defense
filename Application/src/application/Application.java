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
    Player p;
    
    public static void main(String[] args)
    {
        Application game = new Application();
    }
    
    public Application()
    {
        p = new Player();
        MenuController mc = new MenuController();
        while(mc.getMUI().isVisible())
        {
            if(mc.getMUI().isVisible())
            {
                mc.setVisible(true);
            }
            if(!mc.getMUI().isVisible())
            {
                mc.setVisible(false);
                p = mc.getMUI().getPlayer();
                GameScreenController gmc = new GameScreenController(p);
            }
        }
    }
}
