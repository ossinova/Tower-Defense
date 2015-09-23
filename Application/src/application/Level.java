/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Ardjen
 */
import java.awt.Image;
import java.awt.Toolkit;
import java.io.Serializable;

public class Level 
{
    final long serialVersionUID = 100L;
    private String levelName;
    private Image mapImage;
    
    public Level()
    {
        
    }
    
    public void setLevelName(String theLevelName)
    {
        levelName = theLevelName;
    }
    
    public String getLevelName()
    {
        return levelName;
    }
    
    public void setMapImage(String mapImageFileLocation)
    {
        mapImage = Toolkit.getDefaultToolkit().getImage(mapImageFileLocation);
    }
    
    public Image getMapImage()
    {
        return mapImage;
    }
}
