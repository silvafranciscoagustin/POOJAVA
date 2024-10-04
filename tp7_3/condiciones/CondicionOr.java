package tp7_3.condiciones;

import tp7_3.Condicion;
import tp7_3.FichaPlanta;

public class CondicionOr extends Condicion {
    public Condicion c1;
    public Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(FichaPlanta fp) {
        return c1.cumple(fp) || c2.cumple(fp);
    }
}
