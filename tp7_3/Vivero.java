package tp7_3;

import tp7_1.Buscar;

import java.util.ArrayList;

public class Vivero {
    private ArrayList<FichaPlanta> fichasPlantas;

    public Vivero(){
        this.fichasPlantas = new ArrayList<>();
    }



    public ArrayList<FichaPlanta> buscarFichas(Condicion cc){
        ArrayList<FichaPlanta> retorno = new ArrayList<>();
        for (FichaPlanta fp: fichasPlantas) {
            if(cc.cumple(fp)){
                retorno.add(fp);
            }
        }
        return retorno;
    }

    public void addFichaPlanta(FichaPlanta fp){
        this.fichasPlantas.add(fp);
    }

    public ArrayList<FichaPlanta> getFichasPlantas() {
        return new ArrayList<>(fichasPlantas);
    }

    public void setFichasPlantas(ArrayList<FichaPlanta> fichasPlantas) {
        this.fichasPlantas = new ArrayList<>(fichasPlantas);
    }
}
