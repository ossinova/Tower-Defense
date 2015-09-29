package application;

/**
 *
 * @author Ardjen
 */
public class Player 
{
    private int health;
    private int money;
    private int score;
    private String userName;
    
    //private Level level;
    
    public Player()
    {
        this.setHealth(100);
        this.setMoney(30);
        this.setScore(0);
        
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
    
    public Player(String userName)
    {
        this.userName = userName;
        System.out.println(" Player name: " + userName);
    }
    
    public String getName()
    {
        return userName;
    }
}
