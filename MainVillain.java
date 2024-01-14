import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainVillain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainVillain extends Actor
{
    /**
     * Act - do whatever the MainVillain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movingAround();
    }
    public void movingAround()
    {
        move(3);
        if(getX() >= 799)
        {
            setLocation(0, getY());
        }
    }
    
}
