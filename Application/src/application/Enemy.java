/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author Ardjen
 */
public class Enemy 
{
    private int health;
    private int speed;
    private int damage;
    private boolean isVisible;
    private int x;
    private int y;
    
    public Enemy()
    {
        
    }
    
    public void setHealth(int theHealth)
    {
        health = theHealth;
        if(health >= 0 )
        {
            isVisible = false;
        }
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void setSpeed(int theSpeed)
    {
        speed = theSpeed;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public void setDamage(int theDamage)
    {
        damage = theDamage;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public void setIsVisible(boolean visibleState)
    {
        isVisible = visibleState;
    }
    
    public boolean getIsVisible()
    {
        return isVisible;
    }
    
    public void setX(int theX)
    {
        x = theX;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setY(int theY)
    {
        y = theY;
    }
    
    public int getY()
    {
        return y;
    }
}
