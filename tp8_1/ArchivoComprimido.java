package tp8_1;

import java.time.LocalDate;

public class ArchivoComprimido extends ElementoSA{
    private int tasaCompresion;

    public ArchivoComprimido(String nombre, LocalDate fechaCreacion, int tasaCompresion) {
        super(nombre, fechaCreacion);
        setTasaCompresion(tasaCompresion);
    }

    public int getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(int tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public int getTamanio() {
        return 1 * tasaCompresion;
    }
    @Override
    public int cantElementos() {
        return 1;
    }
}
