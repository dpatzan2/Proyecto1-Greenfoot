import greenfoot.*;

public class PantallaInicio extends World {
    private GreenfootSound startSound = new GreenfootSound("soundtrack.mp3");

    public PantallaInicio() {
        super(800, 600, 1);
        prepare();
        startSound.playLoop(); 
    }

    private void prepare() {
        BotonMyWorld botonMyWorld = new BotonMyWorld();
        BotonCreditos botonCreditos = new BotonCreditos();

        addObject(botonMyWorld, getWidth() / 2, getHeight() / 2);
        addObject(botonCreditos, getWidth() / 2, getHeight() / 2 + 50);
    }

    public void stopStartSound() {
        startSound.stop(); 
    }
}
