import greenfoot.*;

public class BotonRegresarInicio extends Actor {
    public BotonRegresarInicio() {
        GreenfootImage botonImage = new GreenfootImage("boton_regresar.png");
        botonImage.scale(150, 50); // Ajusta el tamaño del botón aquí
        setImage(botonImage);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new PantallaInicio());
        }
    }
}
