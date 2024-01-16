import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the main villain, who constantly runs down the middle, 
 * creating a distraction and making it harder for the user
 * to track down it's objective of collecting apples. 
 * 
 * @author Tanav Majithia
 * @version January 14 2024
 */
public class MainVillain extends Actor
{
    /**
     * Array added here to make the bear move slightly with a tiny animation
     */
    private int[] turns;
    private int[] moves;
    private int index;
    
    public MainVillain()
    {
        turns = new int[4];
        moves = new int[4];
        
        turns[0] = 3;
        turns[1] = 3;
        turns[2] = -3;
        turns[3] = -3;
        moves[0] = 2;
        moves[1] = 2;
        moves[2] = 2;
        moves[3] = 2;
        
        index = 0;
    }
    /**
     * The act method is simply being used as a place to put a method.
     */
    public void act()
    {
        movingAround();
        turn(turns[index % turns.length]);
        move(moves[index % moves.length]);
        index++;
        
    }
    
    /**
     * This method is how the bear is able to move every time, as well as
     * reset to the start everytime it's about to reach the end 
     * of the screen.
     */
    public void movingAround()
    {
        move(3);
        if(getX() >= 799)
        {
            setLocation(0, getY());
        }
    }
    
}
