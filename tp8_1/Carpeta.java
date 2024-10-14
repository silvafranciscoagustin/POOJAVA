package tp8_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carpeta  extends ElementoSA {
    private ArrayList<ElementoSA> elementos;


    public Carpeta(String nombre, LocalDate fechaCreacion){
        super(nombre,fechaCreacion);
        elementos = new ArrayList<>();
    }

    @Override
    public int getTamanio() {
        int suma = 0;
        for (ElementoSA subElemento: elementos) {
            suma += subElemento.getTamanio();
        }
        return suma;
    }

    public int cantElementos(){
        int total =0;
        for (ElementoSA subElem : elementos){
            total += subElem.cantElementos();
        }
        return total+1;
    }

    public ArrayList<ElementoSA> getElementos() {
        return new ArrayList<>(elementos);
    }

    public void setElementos(ArrayList<ElementoSA> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }
}
