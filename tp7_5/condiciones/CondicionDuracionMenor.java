package tp7_5.condiciones;

import tp7_5.Condicion;
import tp7_5.Pelicula;

public class CondicionDuracionMenor extends Condicion {
    private int minutosMaximos;

    public CondicionDuracionMenor(int minutosMaximos) {
        this.minutosMaximos = minutosMaximos;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getMinutosDuracion()<this.getMinutosMaximos();
    }

    public int getMinutosMaximos() {
        return minutosMaximos;
    }

    public void setMinutosMaximos(int minutosMaximos) {
        this.minutosMaximos = minutosMaximos;
    }
}
