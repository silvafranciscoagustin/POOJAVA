package tp7_5.condiciones;

import tp7_5.Condicion;
import tp7_5.Pelicula;

public class CondicionGenero extends Condicion {
    private String genero;

    public CondicionGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getGeneros().contains(this.getGenero());
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
