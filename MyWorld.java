import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * Name : SuJin Lee
 * Course : CS20S
 * Teacher : Mr. Hardman
 * Final Project
 * Data Last Modified :
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static Score playerScore;
    private boolean startGame;

    /**
     * Constructor for objects of class MyWorld.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    /**
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        if( startGame == true)
        {
            checkWin();
        }
    }
    
    /**
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkWin() 
    {
        if( playerScore.getScore() >= 10 )
        {
           removeObjects( getObjects(null) );
           showText("YOU WIN!!", 400, 400);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void prepare()
    {
        Tracer tracer = new Tracer( "pig", "snake");
        addObject(tracer,116,205);

        Score score = new Score(true);
        addObject(score, 400, 750);
        Pig pig = new Pig();
        addObject(pig,483,109);
        Pig pig2 = new Pig();
        addObject(pig2,637,108);
        Pig pig3 = new Pig();
        addObject(pig3,729,274);
        Pig pig4 = new Pig();
        addObject(pig4,581,483);
        Pig pig5 = new Pig();
        addObject(pig5,300,611);
        Pig pig6 = new Pig();
        addObject(pig6,145,529);
        Pig pig7 = new Pig();
        addObject(pig7,126,703);
        Pig pig8 = new Pig();
        addObject(pig8,704,707);
        Pig pig9 = new Pig();
        addObject(pig9,476,665);
        Pig pig10 = new Pig();
        addObject(pig10,468,357);
        Pig pig11 = new Pig();
        addObject(pig11,632,331);
        Pig pig12 = new Pig();
        addObject(pig12,726,526);
        Pig pig13 = new Pig();
        addObject(pig13,300,441);
        Pig pig14 = new Pig();
        addObject(pig14,379,154);
        Pig pig15 = new Pig();
        addObject(pig15,548,236);
        Pig pig16 = new Pig();
        addObject(pig16,430,524);
        Pig pig17 = new Pig();
        addObject(pig17,765,113);
        Pig pig18 = new Pig();
        addObject(pig18,296,744);
        Pig pig19 = new Pig();
        addObject(pig19,554,743);
        Pig pig20 = new Pig();
        addObject(pig20,619,618);
        Snake snake = new Snake();
        addObject(snake,759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
        snake.setLocation(759,392);
    }
    
    /**
     * @param There are no parameters
     * @return Nothing is returned
     */
    public boolean getStarted()
    {
        return startGame;
    }
}
