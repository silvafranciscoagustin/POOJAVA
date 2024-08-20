package TP2_1;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    ArrayList<Temporada> temporadas = new ArrayList<>();


    public Serie( String titulo, String descripcion, String creador, String genero,ArrayList<Temporada> temporadas){
        setTitulo(titulo);
        setDescripcion(descripcion);
        setCreador(creador);
        setGenero(genero);
        setTemporadas(temporadas);
    }
    public Serie(String titulo, String descripcion, String creador, String genero){
        this(titulo,descripcion,creador,genero,new ArrayList<>());
    }
    public Serie(String titulo, String descripcion, String creador){
        this(titulo,descripcion,creador,"Thriller");
    }
    public Serie(String titulo, String descripcion){
        this(titulo,descripcion,"Vince Gilligan");
    }
    public Serie(String titulo){
        this(titulo,"Best Series Ever");
    }
    public Serie(){
        this("Breaking Bad");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    //Obtener el total de episodios vistos de una serie
    public int obtenerTotalEpisodiosVistos(){
        int totalEpisodiosVistos=0;
        for (int i = 0; i < temporadas.size(); i++) {
            Temporada temporada = temporadas.get(i);
            totalEpisodiosVistos += temporada.getEpisodiosVistos();
        }
        return totalEpisodiosVistos;
    }

    //Obtener el promedio de las calificaciones dadas para una serie
    public double obtenerPromedioSerie(){
        double promedio = 0, suma = 0;

        for (int i = 0; i <temporadas.size() ; i++) {
            double temporada = temporadas.get(i).obtenerPromedioTemp();
            suma+=temporada;
        }

        promedio = suma/temporadas.size();
        return promedio;
    }

    //Determinar si se vio todos los episodios de la serie.
    public boolean vioTodosLosEpisodios(){
        for (int i = 0; i < temporadas.size(); i++) {
            if(!temporadas.get(i).vioTodosLosEpisodios())return false;
        }
        return true;
    }
}
