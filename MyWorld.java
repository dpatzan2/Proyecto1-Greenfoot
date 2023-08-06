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
    public static final int WIDTH = 50;
    private int velocidad_coche;
    private int num_adelantamientos;
    private int num_adelantamientos_nivel;
    private Carro carro;
    private int num_rivales;
    private static MyWorld instance;
    private GreenfootSound gameSound = new GreenfootSound("soundtrack.mp3");
    public MyWorld()
    {    
        super(810,700,1);
        num_adelantamientos = 0;
        num_adelantamientos_nivel = 4;
        velocidad_coche = 5;
        
        score = new Contador("Score: " );
        level = new Contador("Level: " );
        level.add(1);
        carro = new Carro(velocidad_coche);
        addObject(carro, 300, 600);
        addObject(level, 80, 90);
        addObject(score, 80, 60);
    }
    public void act(){
        aumentar_dificultad();
        aniadir_rivales();
        
    }
    public static MyWorld getInstance() {
        if (instance == null) {
            instance = new MyWorld();
        }
        return instance;
    }
    public static void playGameSound() {
        getInstance().gameSound.playLoop();    
    }
    public static void stopGameSound() {
        getInstance().gameSound.stop();
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
    System.out.println(num_adelantamientos);
    if(num_adelantamientos >= num_adelantamientos_nivel){
        num_adelantamientos = 0;
        num_adelantamientos_nivel = num_adelantamientos_nivel + 2;
        velocidad_coche++;
        level.add(1);
        carro.aumenta_velocidad();
    }
}

    public void aniadir_rivales(){
    if(num_rivales == 0){
        int[] carriles = {230, 395, 575};
        int carrilIndex = Greenfoot.getRandomNumber(carriles.length);
        
        int offsetX = 40; 
        
        for (int i = 0; i < 4; i++) {
            int posX = carriles[carrilIndex] - offsetX; 
            
            if(carrilIndex == 0){
                addObject(new Muro(velocidad_coche), posX + i * MyWorld.WIDTH, 80);
            }
            else if( carrilIndex == 1){
                addObject(new Muro(velocidad_coche), posX + i * MyWorld.WIDTH, 80);
            }
            else{
                addObject(new Muro(velocidad_coche), posX + i * MyWorld.WIDTH, 80);
            }
            
            carrilIndex++;
            carrilIndex = carrilIndex % carriles.length;
        }
        
        num_rivales = 4;
    }
}





}