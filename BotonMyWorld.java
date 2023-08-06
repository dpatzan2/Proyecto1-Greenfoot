import greenfoot.*;

public class BotonMyWorld extends Actor {
    //Codigo con ayuda de una AI
    public BotonMyWorld() {
        GreenfootImage botonImage = new GreenfootImage("boton_start.png");
        botonImage.scale(100, 50); // Ajusta el tamaño del botón aquí
        setImage(botonImage);
    }
public void act() {
        if (Greenfoot.mouseClicked(this)) {
            PantallaInicio pantallaInicio = (PantallaInicio) getWorld();
            pantallaInicio.stopStartSound();
            Greenfoot.setWorld(new MyWorld()); 
            MyWorld.playGameSound(); 
        }
    }
}
