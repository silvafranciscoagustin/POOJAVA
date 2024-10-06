package tp7_4.condiciones;

import tp7_4.Condicion;
import tp7_4.Ficha;

public class CondicionLugarMayorA extends Condicion {
    private int lugarMayorA;

    public CondicionLugarMayorA(int lugarMayorA) {
        this.lugarMayorA = lugarMayorA;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getCantCasilleros()>lugarMayorA;
    }
}
