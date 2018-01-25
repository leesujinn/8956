import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Actor
{
    private static int velocity = 0;
    
    /**
     * Act - do whatever the Pig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        World w = getWorld();
        move(-10);
        
        if( isTouching(Apple.class) )
        {
            removeTouching(Apple.class);
        }
        
        
        if ( isAtEdge())
        {
            turn( Greenfoot.getRandomNumber(45) - 25 );
        }
    }    
    
    /**
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void Animation()
    {
        for ( int i = 0; i < 15; i++ )
        {
            setLocation( getX()+1, getY()-2 );
            Greenfoot.delay(1);
        }
    }
    
    /**
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkCollision()
    {
       Score getPoint;
       
       if( getY() <= 10 )
       {
           setRotation( -getRotation() );
       }
       
       if( getX() <= 10)
       {
           getPoint = (Score) getWorld().getObjects(Score.class).get(1);
           getPoint.countScore();
           //world.reset();
        }
    }
    
    /**
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void setVelocity( int v )
    {
        velocity = v;
    }
}
