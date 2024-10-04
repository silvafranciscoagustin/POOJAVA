package tp7_2;

import java.util.ArrayList;

public class ColeccionDocumento {
    private String nombre;
    private  ArrayList<Documento> documentos;


    public ColeccionDocumento(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.documentos = new ArrayList<>();
    }

    public ArrayList<Documento> buscarDocumentos(Condicion c){
        ArrayList<Documento> retorno = new ArrayList<>();
        for(Documento doc : documentos){
            if(c.cumple(doc)){
                retorno.add(doc);
            }
        }
        return retorno;
    }


    public void addDocumento(Documento doc){
        this.documentos.add(doc);
    }

    public ArrayList<Documento> getDocumentos() {
        return new ArrayList<>(documentos);
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = new ArrayList<>(documentos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
