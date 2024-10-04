package tp7_2.condiciones;

import tp7_2.Condicion;
import tp7_2.Documento;

public class CondicionAutor extends Condicion {
    private String autor;

    public CondicionAutor(String autor){
        this.autor = autor;
    }


    @Override
    public boolean cumple(Documento doc) {
        for(String aa : doc.getAutores()){
            if (aa.equalsIgnoreCase(autor)){
                return true;
            }
        }
        return false;
    }
}
