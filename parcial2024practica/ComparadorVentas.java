package parcial2024practica;

import java.util.Comparator;

public class ComparadorVentas implements Comparator<ElementoVentas> {

    @Override
    public int compare(ElementoVentas o1, ElementoVentas o2) {
        return o1.getCantidadTotalVentas()-o2.getCantidadTotalVentas();
    }
}
