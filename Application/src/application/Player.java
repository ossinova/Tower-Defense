package application;

import java.io.Serializable;
/**
 *
 * @author Ardjen
 */
public class Player 
{
    final long serialVersionUID = 101L;
    private int health;
    private int money;
    private int score;
    private String userName;
    private Level level;
    
    public Player()
    {
        
    }
    
    public void setHealth(int theHealth)
    {
        health = theHealth;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void setMoney(int theMoney)
    {
        money = theMoney;
    }
    
    public int getMoney()
    {
        return money;
    }
    
    public void setScore(int theScore)
    {
        score = theScore;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void setName(String theName)
    {
        userName = theName;
    }
    
    public String getName()
    {
        return userName;
    }
}
