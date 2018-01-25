import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tracer extends Actor
{
    //World w;
    private final int MAX_PIGS = 10;
    private int numEaten;
    private String pig;
    private String snake;
    private boolean scoreChanged;
    
    /**
     * @param list about the pig and snake on this game
     * @return Nothing is returned
     */
    public Tracer ( String pig, String snake )
    {
       this.pig = pig;
       this.snake = snake;
    }
    
    /**
     * @param There are no parameters
     * @return string again the pig
     */
    public String getPig()
    {
        return pig;
    }
    
    /**
     * @param There are no parameters
     * @return list again the snake
     */
    public String getSnake()
    {
        return snake;
    }
    
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        //w = getWorld();
        // Add your action code here.
        mover();
        shooter();
        boolean isTouching;
        getPig();
        
        if( isTouching( Pig.class ) )
        {
           removeTouching( Pig.class );
           numEaten++; 
        }
        
        if( numEaten == MAX_PIGS)
        {
            getWorld().showText("YOU WIN!!", getWorld().getWidth()/2, getWorld().getHeight()/2 );
            Greenfoot.stop();
        }
        
        if( Greenfoot.mouseClicked(this) )
        {
           System.out.println( toString() );   
        }
        
        /**for( int i = 0; isTouching == true && i > 10; i++ )
        {
            if( getPig() < 10 )
            {
                scoreChanged = true;
                Greenfoot.stop();
            }
        }*/
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
    public void mover()
    {
        if (Greenfoot.isKeyDown("up") )
        {
            setLocation( getX(), getY() - 10 );
        }
        
        if (Greenfoot.isKeyDown("down") )
        {
            setLocation( getX(), getY() + 10 );
        }
        
        if (Greenfoot.isKeyDown("right") )
        {
            setLocation( getX() + 10, getY());
        }
        
        if (Greenfoot.isKeyDown("left") )
        {
            setLocation( getX() - 10, getY());
        }
    }
    
    /**
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void shooter()
    {
        World w = getWorld();
        
        if( Greenfoot.isKeyDown("space"))
        {
            w.addObject( new Shots(), getX() + 50, getY() );
        }
    }
    
    /**
     * @param There are no parameters
     * @return express the string of information of Tracer
     */
    public String toString()
    {
         return String.format("Pig: %15s\nSnake: %15s", pig, snake ); 
    }
}

