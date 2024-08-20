package TP2_1;

import java.util.ArrayList;

public class Temporada {
    private int nroTemp;
    private ArrayList<Episodio> episodios = new ArrayList<>();

    public Temporada(int nroTemp,ArrayList<Episodio> episodios ){
        setNroTemp(nroTemp);
        setEpisodios(episodios);
    }
    public Temporada(int nroTemp){
        this(nroTemp,new ArrayList<>());
    }
    public Temporada(){
        this(1);
    }


    public int getNroTemp() {
        return nroTemp;
    }

    public void setNroTemp(int nroTemp) {
        this.nroTemp = nroTemp;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }


    //Obtener el total episodios vistos de una temporada particular.
    public int getEpisodiosVistos(){
        int episodiosVistos= 0;
        for(int i = 0;i<episodios.size();i++){
            Episodio episodio = episodios.get(i);
            if(episodio.isVisto())episodiosVistos++;
        }
        return episodiosVistos;
    }
    //Obtener el promedio de las calificaciones dadas para una temporada particular
    public double obtenerPromedioTemp(){
        double contador = 0, suma = 0;

        for (int i = 0; i < episodios.size(); i++) {
            if(episodios.get(i).isVisto()){
                suma += episodios.get(i).getCalificacion();
                contador++;
            }
        }
        return contador == 0 ? 0 : suma/contador;
    }

    //vio todos los episodios
    public boolean vioTodosLosEpisodios(){
        for (int i = 0; i < episodios.size(); i++) {
            if(!episodios.get(i).isVisto()) {
                return false;
            }
        }
        return true;
    }

}


