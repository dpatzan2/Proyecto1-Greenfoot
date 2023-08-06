import greenfoot.*;

public class PantallaInicio extends World {
    public PantallaInicio() {
        super(800, 600, 1);
        prepare();
    }

    private void prepare() {
        BotonMyWorld botonMyWorld = new BotonMyWorld();
        BotonCreditos botonCreditos = new BotonCreditos();

        // Agregar los botones al escenario de inicio
        addObject(botonMyWorld, getWidth() / 2, getHeight() / 2);
        addObject(botonCreditos, getWidth() / 2, getHeight() / 2 + 50);
    }
}
