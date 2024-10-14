package tp7_5.condiciones;

import tp7_5.Condicion;
import tp7_5.Pelicula;

public class CondicionTitulo extends Condicion {
    private String Titulo;

    public CondicionTitulo(String titulo) {
        Titulo = titulo;
    }

    @Override
    public boolean cumple(Pelicula p) {//en el caso este es contains pq en el enunciado dice que contenga,
        //sino se usa el equals, para que sea exacto!
        return p.getTitulo().contains(this.getTitulo());
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
