import greenfoot.*;

public class Creditos extends World {
    public Creditos() {
        super(800, 600, 1);
        prepare();
    }

    private void prepare() {
        BotonRegresarInicio botonRegresarInicio = new BotonRegresarInicio();
        addObject(botonRegresarInicio, 100, 100); // Colocamos el botón en la esquina superior izquierda
    }
}
