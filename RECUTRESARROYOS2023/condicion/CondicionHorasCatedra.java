package RECUTRESARROYOS2023.condicion;

import RECUTRESARROYOS2023.ElementoEducativo;
import RECUTRESARROYOS2023.condicion.Condicion;

public class CondicionHorasCatedra extends Condicion {
    private double horasMaximas;

    @Override
    public boolean cumple(ElementoEducativo c) {
        return c.getHorasCatedra() < horasMaximas;
    }
}
