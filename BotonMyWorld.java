import greenfoot.*;

public class BotonMyWorld extends Actor {
    public BotonMyWorld() {
        GreenfootImage botonImage = new GreenfootImage("boton_start.png");
        botonImage.scale(100, 50); // Ajusta el tamaño del botón aquí
        setImage(botonImage);
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
