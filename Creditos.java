import greenfoot.*;

public class Creditos extends World {
    //Codigo con ayuda de una AI
    public Creditos() {
        //Se crea el mundo Creditos
        super(800, 600, 1);
        prepare();
    }

    private void prepare() {
        //Se genera el boton para regresar al menu
        BotonRegresarInicio botonRegresarInicio = new BotonRegresarInicio();
        // Colocamos el botón en la esquina superior izquierda
        addObject(botonRegresarInicio, 100, 100);
    }
}
