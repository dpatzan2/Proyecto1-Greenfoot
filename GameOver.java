import greenfoot.*;

public class GameOver extends World {
    public GameOver() {
        super(800, 600, 1);
        prepare();
    }

    private void prepare() {
        BotonMyWorld botonMyWorld = new BotonMyWorld();
        BotonRegresarInicio botonRegresarInicio = new BotonRegresarInicio();

        // Agregar los botones al escenario de inicio
        addObject(botonMyWorld, 450, 450);
        addObject(botonRegresarInicio, 575, 450);
    }
}