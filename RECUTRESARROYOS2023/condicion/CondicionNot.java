package RECUTRESARROYOS2023.condicion;

import RECUTRESARROYOS2023.ElementoEducativo;

public class CondicionNot extends Condicion{
    Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(ElementoEducativo c) {
        return !c1.cumple(c);
    }
}
