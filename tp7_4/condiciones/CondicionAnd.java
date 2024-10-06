package tp7_4.condiciones;

import tp7_4.Condicion;
import tp7_4.Ficha;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Ficha f) {
        return c1.cumple(f) && c2.cumple(f);
    }
}
