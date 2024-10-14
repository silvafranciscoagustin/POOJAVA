package tp7_5.condiciones;

import tp7_5.Condicion;
import tp7_5.Pelicula;

public class CondicionAnioMenor extends Condicion {
    private int anio;

    public CondicionAnioMenor(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getAnioEstreno()<anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
