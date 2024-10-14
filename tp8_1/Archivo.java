package tp8_1;

import java.time.LocalDate;

public class Archivo extends ElementoSA{
    private int tamanio;

    public Archivo(String nombre, LocalDate fechaCreacion, int tamanio) {
        super(nombre, fechaCreacion);
        setTamanio(tamanio);
    }



    public int getTamanio() {
        return tamanio;
    }
    @Override
    public int cantElementos() {
        return 1;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
