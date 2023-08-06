import greenfoot.*;

public class PantallaInicio extends World {
    //Codigo con ayuda de una AI
    public PantallaInicio() {
        //Se crea el mundo PantallaInicio
        super(800, 600, 1);
        prepare();
    }

    private void prepare() {
        //Se agrega el boton para jugar
        BotonMyWorld botonMyWorld = new BotonMyWorld();
        //Se agrega el boton para ver los creditos
        BotonCreditos botonCreditos = new BotonCreditos();

        // Agregar los botones al escenario de inicio
        addObject(botonMyWorld, getWidth() / 2, getHeight() / 2);
        addObject(botonCreditos, getWidth() / 2, getHeight() / 2 + 50);
    }
}
