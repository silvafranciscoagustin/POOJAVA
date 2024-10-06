package tp7_4.condiciones;

import tp7_4.Condicion;
import tp7_4.Ficha;

public class CondicionDestruccionMayor extends Condicion {
    private int destruccionMayorA;

    public CondicionDestruccionMayor(int destruccionMayorA) {
        this.destruccionMayorA = destruccionMayorA;
    }

    @Override
    public boolean cumple(Ficha f) {
        return (f.getPoderDestruccion()> destruccionMayorA);
    }
}
