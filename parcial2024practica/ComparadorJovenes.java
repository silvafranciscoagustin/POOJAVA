package parcial2024practica;

import java.util.Comparator;

public class ComparadorJovenes implements Comparator<ElementoVentas> {

    public int compare(ElementoVentas o1, ElementoVentas o2){
        return Double.compare(o1.getEdad(),o2.getEdad());
    }
}
