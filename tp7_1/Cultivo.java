package tp7_1;


import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentesCultivo;


    public Cultivo(String nombre){
        setNombre(nombre);
        enfermedadesFrecuentesCultivo = new ArrayList<>();
    }




    public void addEnfermedad(Enfermedad enfermedad){
        this.enfermedadesFrecuentesCultivo.add(enfermedad);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Enfermedad> getEnfermedadesFrecuentesCultivo() {
        return  new ArrayList<>(enfermedadesFrecuentesCultivo);
    }

    public void setEnfermedadesFrecuentesCultivo(ArrayList<Enfermedad> enfermedadesFrecuentesCultivo) {
        this.enfermedadesFrecuentesCultivo = new ArrayList<>(enfermedadesFrecuentesCultivo);
    }


    //es de ultilidad (ProductoQuimico p1);

}
