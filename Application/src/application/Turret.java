/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.Serializable;

/**
 *
 * @author Ardjen
 */
public class Turret 
{
    final long serialVersionUID = 102L;
    private int cost;
    private int damage;
    private int range; //I assume this will create a range * range square that will simulate the range
    private int rateOfFire;
    private Image turretImage;
    private boolean isLocked;
    
    public Turret()
    {
        
    }
    
    public void setCost(int theCost)
    {
        cost = theCost;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public void setDamage(int theDamage)
    {
        damage = theDamage;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public void setRange(int theRange)
    {
        range = theRange;
    }
    
    public int getRange()
    {
        return range;
    }
    
    public void setRateOfFire(int theRateOfFire)
    {
        rateOfFire = theRateOfFire;
    }
    
    public int getRateOfFire()
    {
        return rateOfFire;
    }
    
    public void setTurretImage(String turretImageFileLocation)
    {
        turretImage = Toolkit.getDefaultToolkit().getImage(turretImageFileLocation);
    }
    
    public Image getTurretImage()
    {
        return turretImage;
    }
    
    public void setIsLocked(boolean isLockedState)
    {
        isLocked = isLockedState;
    }
    
    public boolean getIsLocked()
    {
        return isLocked;
    }
    
}
