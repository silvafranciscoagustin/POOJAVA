package tp8_1;

import java.time.LocalDate;

public class AccesoDirecto extends ElementoSA{
    private static final int TAMANIO_EN_DISCO_KB = 1;

    public AccesoDirecto(String nombre, LocalDate fechaCreacion, int tamanioEnDiscoKb) {
        super(nombre, fechaCreacion);
    }

    @Override
    public int getTamanio() {
        return TAMANIO_EN_DISCO_KB;
    }
    @Override
    public int cantElementos() {
        return 1;
    }

    public int getTamanioEnDiscoKb() {
        return TAMANIO_EN_DISCO_KB;
    }

}
