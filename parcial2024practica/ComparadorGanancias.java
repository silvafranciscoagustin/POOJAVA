package parcial2024practica;

import java.util.Comparator;

public class ComparadorGanancias implements Comparator<ElementoVentas> {

    @Override
    public int compare(ElementoVentas o1, ElementoVentas o2) {
        return Double.compare(o1.getGanancias(),o2.getGanancias());
    }
}
