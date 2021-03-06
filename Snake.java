import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        World w = getWorld();
        move(-5);
        
        if( isTouching(Pig.class) )
        {
            removeTouching(Pig.class);
        }
        
        if( isAtEdge() )
        {
            turn ( 30 );
        }
    }    
}
