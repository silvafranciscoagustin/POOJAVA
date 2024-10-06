package tp7_4;

import java.util.ArrayList;

public class Tablero {
    private int puntajeMinimo;
    private ArrayList<Ficha> fichas;
    private int dificultad;

    public Tablero(int puntajeMinimo, int dificultad) {
        setPuntajeMinimo(puntajeMinimo);
        fichas = new ArrayList<>();
        setDificultad(dificultad);
    }

    public ArrayList<Ficha> buscarFichas(Condicion c){
        ArrayList<Ficha> retorno = new ArrayList<>();
        for (Ficha f: fichas) {
            if(c.cumple(f)) retorno.add(f);
        }
        return retorno;
    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }

    public void addFicha(Ficha f){
       // if(!fichas.contains(f)){
            fichas.add(f);
        //}
    }

    public ArrayList<Ficha> getFichas() {
        return new ArrayList<>();
    }


    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = new ArrayList<>(fichas);
    }


    public int getDificultad() {
       int sumaFortalezas=0;
       int sumaPoderDestruccion=0;
        for (Ficha f: fichas) {
            sumaFortalezas+=f.getGolpesNecesariosParaDestruirla();
            sumaPoderDestruccion += f.getPoderDestruccion();
        }
        return sumaFortalezas/sumaPoderDestruccion;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
}
