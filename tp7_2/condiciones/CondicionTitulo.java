package tp7_2.condiciones;

import tp7_2.Condicion;
import tp7_2.Documento;

public class CondicionTitulo extends Condicion {
    private String titulo;

    public CondicionTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento d) {
        if(d.getTitulo().equalsIgnoreCase(titulo)){
            return true;
        }else{
            return false;}
    }
}
