import greenfoot.*;

public class BotonCreditos extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Creditos());
        }
    }
}
