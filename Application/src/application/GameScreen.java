/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author OssiNova
 */
public class GameScreen extends JPanel //implements ActionListener
{
    private Player player;
    private Level level;
    private TurretListView turretList;
    private Turret turret;
    protected JButton pauseButton;
    protected JButton newWave;
    protected JButton sellButton;
    protected JButton moveButton;
    
    protected JLabel nameLabel;
    protected JLabel healthLabel;
    protected JLabel moneyLabel;
    protected JLabel scoreLabel;
    protected JLabel levelLabel;
    
    protected JPanel menu;
    protected JPanel display;
    protected JPanel board;
    
    protected ImageIcon turretImage = new ImageIcon("notebook-paper-clipart.png");
    
    protected JButton paperBTN;
    protected JButton eraserBTN; 
    protected JButton pencilBTN;
    
    protected boolean turretSelected;
    
    protected int[] path;

    protected String userName, health, money, score, levelName;
    
    public GameScreen(Player p) 
    {
        super();
         
        setLayout(null);
        
        player = p;
        level = new Level();
        turretSelected = false;
        
        int[] temp = {1, 2, 14, 15, 16, 28, 40, 52, 64, 65, 66, 78, 90, 91, 92, 93, 81, 69, 70, 71, 83, 95, 107, 119, 131, 143};
        path = temp;
        
        buttonSetup();
        userDisplaySetup();
        boardSetup();
        
        setSize(1200, 800);
        setVisible(true);
        
        board.setBounds(0, 40, 720, 720);
        menu.setBounds(0, 0, 1200, 40);
        display.setBounds(720, 20, 300, 600);
        add(board);
        add(menu);
        add(display);

        
    }
    
    public void buttonSetup()
    {
        menu = new JPanel();
        
        pauseButton = new JButton("Pause");
          pauseButton.addActionListener(new menuListener());
          menu.add(pauseButton);
        newWave = new JButton("New Wave");
          newWave.addActionListener(new menuListener());
          menu.add(newWave);
        sellButton = new JButton("Sell Turret");
          sellButton.addActionListener(new menuListener());
         menu.add(sellButton);
        moveButton = new JButton("Move Turret");
         moveButton.addActionListener(new menuListener());
         menu.add(moveButton);
    }
    
    
    public void userDisplaySetup()
    {
        display = new JPanel();
        GridLayout gl= new GridLayout(5, 1);
        display.setLayout(gl);
        
        Font f = new Font("Impact", Font.BOLD, 20);
        
        health = Integer.toString(player.getHealth());
        money = Integer.toString(player.getMoney());
        score = Integer.toString(player.getScore());
        levelName = level.getLevelName();
        userName = player.getName();
        
        
        nameLabel = new JLabel("Name: "+userName);
          nameLabel.setFont(f);
         display.add(nameLabel);
        healthLabel = new JLabel("HP: "+health);
          healthLabel.setFont(f);
          display.add(healthLabel);
        moneyLabel = new JLabel("Money: "+money);
          moneyLabel.setFont(f);
          display.add(moneyLabel);
        scoreLabel = new JLabel("Score: "+score);
          scoreLabel.setFont(f);
          display.add(scoreLabel);
        levelLabel = new JLabel(levelName);
          levelLabel.setFont(f);
          display.add(levelLabel);
          levelLabel.setBounds(250,700,100,50);
          
        paperBTN = new JButton("Paper");
          paperBTN.addActionListener(new towerListener());
        eraserBTN = new JButton("Eraser"); 
          eraserBTN.addActionListener(new towerListener());
        pencilBTN = new JButton("Pencil");
          pencilBTN.addActionListener(new towerListener());
         
      
        display.add(paperBTN);
        display.add(eraserBTN);
        display.add(pencilBTN);
        
    }
    
    
    public void boardSetup()
    {
        int width = 720;
        int height = 720;
        board = new JPanel();
        board.setSize(width, height);
        //board.setBackground();
        board.setLayout(null);
        int counter = 1;
        for(int x = 0; x < width; x++)
        {
            for(int y = 0; y < height; y++)
            {
                if(x % 60 == 0 && y % 60 ==0)
                {
                    JButton btn = new JButton();
                    btn.setBounds(x, y, 60, 60);
                    btn.setBackground(Color.GREEN);
                    btn.addActionListener(new tileListener());
                    for(int i = 0; i < path.length; i++)
                    {
                        if(counter == path[i])
                        {
                            btn.setBackground(Color.RED);
                            btn.removeActionListener(new tileListner());
                        }
                    }
                    board.add(btn);
                    counter++;
                 }
            }
        
    }
    }
    
    public void placeTurret(String turret)
    {
        if(turret.equals("Paper"))
        {
            turretImage = new ImageIcon("http://www.clker.com/cliparts/x/b/z/L/5/p/lined-paper-hi.png");
        }
        if(turret.equals("Eraser"))
        {
            turretImage = new ImageIcon("http://images.clipartpanda.com/eraser-clipart-black-and-white-13471970421371056508erasers-hi.png");
        }
        if(turret.equals("Pencil"))
        {
            turretImage = new ImageIcon("http://www.clker.com/cliparts/y/H/3/0/1/G/pencil-hi.png");
        }
    }
    
    public void loadLevel()
    {
        
    }
    
    public void setPlayer(Player p)
    {
        player = p;
    }
    
    private class tileListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Tile was clicked");
            JButton newButton = (JButton)e.getSource();
            newButton.setBackground(Color.RED);
            
            newButton.setIcon(turretImage);
            newButton.repaint();
            board.remove((JButton)e.getSource());
            board.add(newButton);
            //Find which tile was clicked
            //Determine if a tower can be placed
            //Set tile icon accordingly
        }
    }
    
    private class towerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str = e.getActionCommand();
            
            if(str.equals("Paper"))
            {
                turretSelected = true;
                System.out.println("Paper was clicked");
                placeTurret(str);
            }
            if(str.equals("Eraser"))
            {
                turretSelected = true;
                System.out.println("Eraser was clicked");
                placeTurret(str);
            }
            if(str.equals("Pencil"))
            {
                turretSelected = true;
                System.out.println("Pencil was clicked");
                placeTurret(str);
            }
        }
    }
    
    private class menuListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str = e.getActionCommand();
            
            if(str.equals("New Wave"))
            {
                System.out.println("New wave was clicked");
                //start the next wave
            }
            if(str.equals("Sell Turret"))
            {
                System.out.println("Sell turret was clicked");
                //check if turret is selected
                //remove icon from tile
                //refund player
            }
            if(str.equals("Move Turret"))
            {
                System.out.println("Move turret was clicked");
                //check if turret is selected
                //check if tile is selectede
                //check if tile is clear
                //change icon of tile
            }
            if(str.equals("Pause"))
            {
                System.out.println("Pause was clicked");
                //load pause menu
            }
        }
    }
}
     

