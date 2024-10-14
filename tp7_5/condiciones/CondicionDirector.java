package tp7_5.condiciones;
import tp7_5.Condicion;
import tp7_5.Pelicula;

public class CondicionDirector extends Condicion {
    private String director;

    public CondicionDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getDirector().equalsIgnoreCase(this.getDirector());
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
