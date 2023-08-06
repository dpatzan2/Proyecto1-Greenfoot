import greenfoot.*;

public class BotonCreditos extends Actor {
    public BotonCreditos() {
        GreenfootImage botonImage = new GreenfootImage("boton_creditos.png");
        botonImage.scale(100, 50); // Ajusta el tamaño del botón aquí
        setImage(botonImage);
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Creditos());
        }
    }
}
