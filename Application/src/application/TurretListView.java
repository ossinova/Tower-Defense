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
    }
    
    public ArrayList<Turret> getActiveTurretList()
    {
        return activeTurretList;
    }
}
