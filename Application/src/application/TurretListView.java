/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;

/**
 *
 * @author Ardjen
 */
public class TurretListView 
{
    private ArrayList<Turret> activeTurretList;
    
    public TurretListView()
    {
        activeTurretList = new ArrayList<Turret>();
        turretSetup();
    }
    
    public ArrayList<Turret> getActiveTurretList()
    {
        return activeTurretList;
    }
    
    public void turretSetup()
    {
        Turret paper = new Turret();
          paper.setCost(10);
          paper.setDamage(5);
          paper.setRange(7);
          paper.setRateOfFire(3);
          paper.setIsLocked(false);
        activeTurretList.add(paper);
        
        Turret eraser = new Turret();
          eraser.setCost(50);
          eraser.setDamage(20);
          eraser.setRange(3);
          eraser.setRateOfFire(1);
          eraser.setIsLocked(false);
        activeTurretList.add(eraser);
        
        Turret pencil = new Turret();
          pencil.setCost(25);
          pencil.setDamage(10);
          pencil.setRange(5);
          pencil.setRateOfFire(2);
          pencil.setIsLocked(false);
        activeTurretList.add(pencil);
    }
}
