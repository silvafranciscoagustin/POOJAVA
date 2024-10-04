package tp7_2.condiciones;

import tp7_2.Condicion;
import tp7_2.Documento;

public class CondicionContenidoMinimoPalabras extends Condicion {
    private int cantMinPalabras;
    public CondicionContenidoMinimoPalabras(int cantMinPalabras){
        this.cantMinPalabras = cantMinPalabras;
    }
    @Override
    public boolean cumple(Documento d) {
        String[] palabras = d.getContenidoTextual().split(" ");
        return palabras.length>= cantMinPalabras;
    }
}
