import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    
    private int velocidad_coche;
    private int num_adelantamientos;
    private int num_adelantamientos_nivel;
    private Carro carro;
    private int num_rivales;    
    public MyWorld()
    {    
        super(810,700,1);
        num_adelantamientos = 0;
        num_adelantamientos_nivel = 4;
        velocidad_coche = 2;

        carro = new Carro(velocidad_coche);
        addObject(carro, 300, 600);
    }
    public void act(){
        aumentar_dificultad();
        
    }
    
    
    public int getRandomNumber(int start,int end){
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
    
    
    public void aumentar_num_adelantamientos(){
        num_adelantamientos++;
    }
    
    public void disminuir_num_rivales(){
        num_rivales--;
    }
    public void aumentar_dificultad(){
        if(num_adelantamientos == num_adelantamientos_nivel){
            num_adelantamientos = 0;
            num_adelantamientos_nivel = num_adelantamientos_nivel + 2;
            velocidad_coche++;
               carro.aumenta_velocidad();
        }
    }
    
}
