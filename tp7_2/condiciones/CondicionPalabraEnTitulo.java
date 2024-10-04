package tp7_2.condiciones;

import tp7_2.Condicion;
import tp7_2.Documento;

public class CondicionPalabraEnTitulo extends Condicion {
    private String palabraEnTitulo;

    public CondicionPalabraEnTitulo(String palabraEnTitulo){
        this.palabraEnTitulo = palabraEnTitulo;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().contains(palabraEnTitulo);
    }
}
