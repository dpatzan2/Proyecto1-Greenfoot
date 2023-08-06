import greenfoot.*;

public class BotonRegresarInicio extends Actor {
    //Codigo con ayuda de una AI
    public BotonRegresarInicio() {
        GreenfootImage botonImage = new GreenfootImage("boton_regresar.png");
        botonImage.scale(150, 50); // Ajusta el tamaño del botón aquí
        setImage(botonImage);
    }

    public void act() {
        //Funcionalidad para poder cambiar de mundo al presionar el boton
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new PantallaInicio());
        }
    }
}
