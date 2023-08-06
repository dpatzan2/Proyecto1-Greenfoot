import greenfoot.*;

public class BotonMyWorld extends Actor {
    //Codigo con ayuda de una AI
    public BotonMyWorld() {
        GreenfootImage botonImage = new GreenfootImage("boton_start.png");
        botonImage.scale(100, 50); // Ajusta el tamaño del botón aquí
        setImage(botonImage);
    }
    public void act() {
        //Funcionalidad para poder cambiar de mundo al presionar el boton
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
