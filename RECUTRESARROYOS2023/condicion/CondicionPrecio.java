package RECUTRESARROYOS2023.condicion;

import RECUTRESARROYOS2023.ElementoEducativo;
import RECUTRESARROYOS2023.condicion.Condicion;

public class CondicionPrecio extends Condicion {
    private int precioMaximo;

    public CondicionPrecio(int precioMaximo) {
        this.precioMaximo = precioMaximo;
    }

    public  boolean cumple(ElementoEducativo e){
        return e.getPrecio()<precioMaximo;
    }

}
