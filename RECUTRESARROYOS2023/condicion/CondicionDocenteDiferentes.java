package RECUTRESARROYOS2023.condicion;

import RECUTRESARROYOS2023.ElementoEducativo;
import RECUTRESARROYOS2023.condicion.Condicion;

public class CondicionDocenteDiferentes extends Condicion {
    private int cantDocentesMin;

    public CondicionDocenteDiferentes(int cantDocentesMin) {
        this.cantDocentesMin = cantDocentesMin;
    }

    @Override
    public boolean cumple(ElementoEducativo c) {
        return c.getDocentesAcargo().size() > cantDocentesMin;
    }
}
