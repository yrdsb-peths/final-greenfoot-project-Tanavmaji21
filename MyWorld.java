import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    SimpleTimer time = new SimpleTimer();
    Counter timeCount = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 600, 1);
        addObject(timeCount, 735, 30);
        time.mark();
        getBackground().setColor(new Color(150,200,206));
        getBackground().fill();

        prepare();
        
    }
    public void act()
    {
        timeCount.setValue(time.millisElapsed() /1000);
    }

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Man man = new Man();
        addObject(man,78,57);
        man.setLocation(405,303);
        Villain bear1 = new Villain();
        addObject(bear1, 50, 52);
        Villain bear2 = new Villain();
        addObject(bear2, 80, 82);
        Villain bear3 = new Villain();
        addObject(bear3, 110, 112);
        Villain bear4 = new Villain();
        addObject(bear4, 50, 502);
        Villain bear5 = new Villain();
        addObject(bear5, 80, 532);
        Villain bear6 = new Villain();
        addObject(bear6, 110, 562);

        MainVillain polarBear = new MainVillain();
        addObject(polarBear,55,302);
    }
}
