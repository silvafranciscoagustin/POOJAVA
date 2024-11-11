package parcial2024practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
    private ArrayList<ElementoVentas> elementosVentas;

    public Empresa() {
        this.elementosVentas = new ArrayList<>();
    }

    Comparator<ElementoVentas> criterioRanking;

    public ArrayList<ElementoVentas> getElementosVentas() {
        return new ArrayList<>(elementosVentas);
    }

    public void setElementosVentas(ArrayList<ElementoVentas> elementosVentas) {
        this.elementosVentas = new ArrayList<>(elementosVentas);
    }

    public Comparator<ElementoVentas> getCriterioRanking() {
        return criterioRanking;
    }

    public void setCriterioRanking(Comparator<ElementoVentas> criterioRanking) {
        this.criterioRanking = criterioRanking;
    }



    public ArrayList<ElementoVentas> getRanking(){
        ArrayList<ElementoVentas> aux = new ArrayList<>(elementosVentas);
        Collections.sort(aux, criterioRanking);
        return aux;
    }

}
