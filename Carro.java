import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Actor
{
    private int speed;
    
    public Carro(int v){
        speed = v;
    }
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("right")){
            if(getX() < 700)
                setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("left")){
            if(getX() > 105)
                setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("up")){
            if(getY() > 300)
                setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")){
            if(getY() < 640)
                setLocation(getX(), getY() + speed);
        }
        
    }
    
    public void aumenta_velocidad(){
        speed++;
    }
}
