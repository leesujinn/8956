import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;


/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int playerScore;
    private boolean getStart;
    private boolean scoreChanged;
    
    /**
     * @param start is true of flase
     * @return Nothing is returned
     */
    public Score( boolean start )
    {
        playerScore = 0;
        start = getStart;
        displayScore();
    }
    
    /**
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void displayScore()
    {
        GreenfootImage display;
        
        if( getStart == true )
        {
           display = new GreenfootImage( Integer.toString( playerScore ), 30, Color.GREEN, Color.BLACK );
           setImage(display);
           scoreChanged = false;
        }            
    }
    
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        
        if( scoreChanged == true )
        {
            displayScore();
        }
    }    
    
    /**
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void countScore()
    {
        playerScore ++;
        scoreChanged = true;
    }
    
    /**
     * @param There are no parameters
     * @return player score = tracer hunt pigs
     */
    public int getScore()
    {
        return playerScore;
    }
}
