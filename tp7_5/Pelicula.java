package tp7_5;

import java.util.ArrayList;
public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int anioEstreno;
    private int minutosDuracion;
    private int edadMinima;

    public Pelicula(String titulo, String sinopsis, String genero, String director, ArrayList<String> actores, int anioEstreno, int minutosDuracion, int edadMinima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.generos = new ArrayList<>();
        this.director = director;
        this.actores = new ArrayList<>();
        this.anioEstreno = anioEstreno;
        this.minutosDuracion = minutosDuracion;
        this.edadMinima = edadMinima;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public void addGenero(String g){
        generos.add(g.toLowerCase());
    }

    public ArrayList<String> getGeneros() {
        return new ArrayList<>(generos);
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = new ArrayList<>(generos);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public void addActor(String a){
        actores.add(a.toLowerCase());
    }
    public ArrayList<String> getActores() {
        return new ArrayList<>(actores);
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = new ArrayList<>(actores);
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getMinutosDuracion() {
        return minutosDuracion;
    }

    public void setMinutosDuracion(int minutosDuracion) {
        this.minutosDuracion = minutosDuracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
}
