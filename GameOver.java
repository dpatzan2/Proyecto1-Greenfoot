import greenfoot.*;

public class GameOver extends World {
    private GreenfootSound endSound = new GreenfootSound("endSound.mp3");
    //Codigo con ayuda de una AI
    public GameOver() {
        //Se crea el mundo GameOver
        super(800, 600, 1);
        endSound.setVolume(20);
        endSound.play();
        prepare();
    }

    private void prepare() {
        //Se agrega el boton para jugar de nuevo
        BotonMyWorld botonMyWorld = new BotonMyWorld();
        //Se agrega el boton para regresar a la pantalla de inicio
        BotonRegresarInicio botonRegresarInicio = new BotonRegresarInicio();

        // Agregar los botones a la pantalla de inicio
        addObject(botonMyWorld, 450, 450);
        addObject(botonRegresarInicio, 575, 450);
    }
}