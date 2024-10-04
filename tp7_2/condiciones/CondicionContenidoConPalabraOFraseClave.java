package tp7_2.condiciones;

import tp7_2.Condicion;
import tp7_2.Documento;

public class CondicionContenidoConPalabraOFraseClave extends Condicion {
    private String palabraOFraseClave;
    public CondicionContenidoConPalabraOFraseClave(String palabraOFraseClave){
        this.palabraOFraseClave = palabraOFraseClave;
    }
    @Override
    public boolean cumple(Documento d) {
        return d.getContenidoTextual().contains(palabraOFraseClave);
    }
}
