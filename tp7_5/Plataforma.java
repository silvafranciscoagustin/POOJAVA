package tp7_5;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Pelicula> peliculas;

    public Plataforma(ArrayList<Pelicula> peliculas) {
        this.peliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> buscarPeliculas(Condicion c){
        ArrayList<Pelicula> retorno = new ArrayList<>();
        for(Pelicula p : peliculas){
            if(c.cumple(p)) retorno.add(p);
        }
        return retorno;
    }


    public void addPelicula(Pelicula p){
        peliculas.add(p);
    }
    public ArrayList<Pelicula> getPeliculas() {
        return new ArrayList<>(peliculas);
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = new ArrayList<>(peliculas);
    }

}
