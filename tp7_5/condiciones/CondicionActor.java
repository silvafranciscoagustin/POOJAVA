package tp7_5.condiciones;

import tp7_5.Condicion;
import tp7_5.Pelicula;

public class CondicionActor extends Condicion {
    public String actor;

    public CondicionActor(String a) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getActores().contains(this.actor);
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
