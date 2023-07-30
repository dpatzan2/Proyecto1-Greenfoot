import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
    private ArrayList<Muro> muros;
    private Contador score;
    private Contador level;
    
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
        
        score = new Contador("Score: " );
        level = new Contador("Level: " );
        level.add(1);
        carro = new Carro(velocidad_coche);
        addObject(carro, 300, 600);
        addObject(level, 80, 90);
        addObject(score, 80, 60);
        Greenfoot.playSound("juego.wav");
    }
    public void act(){
        aumentar_dificultad();
        aniadir_rivales();
        
    }
    
    
    public int getRandomNumber(int start,int end){
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
    public void aumentar_puntuacion(int valor){
        score.add(valor);
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
            level.add(1);
            carro.aumenta_velocidad();
        }
    }
    public void aniadir_rivales(){
        
        if(num_rivales == 0){
            
            int carril = getRandomNumber(0,3);
            
            if(carril == 0){
                addObject(new Muro(velocidad_coche),180, 80);
            }
            else if( carril == 1){
                addObject(new Muro(velocidad_coche),getWidth()/2, 80);
            }
            else{
                addObject(new Muro(velocidad_coche),getWidth(), 80);
            }
            
            //System.out.println("" + carril );
            carril++;
            carril = carril % 3;
            
            if(carril == 0){
                addObject(new Muro(velocidad_coche),180, 80);
            }
            else if( carril == 1){
                addObject(new Muro(velocidad_coche),290, 80);
            }
            else{
                addObject(new Muro(velocidad_coche),410, 80);
            }
            
            
            num_rivales = 2;
        }
    }
}
