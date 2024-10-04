package tp7_2.condiciones;

import tp7_2.Condicion;
import tp7_2.Documento;

public class CondicionOr extends Condicion {
    public Condicion c1;
    public Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Documento d) {
        return c1.cumple(d) || c2.cumple(d);
    }
}
