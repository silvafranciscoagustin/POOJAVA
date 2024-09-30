package tp7_1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicosDeLaEnfermedad;


    public Enfermedad(String nombre){
        setNombre(nombre);
        estadosPatologicosDeLaEnfermedad = new ArrayList<>();
    }


    public void addEstadoPatologicoDeLaEnfermedad(String estadoPatologico){
        this.estadosPatologicosDeLaEnfermedad.add(estadoPatologico);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<String> getEstadosPatologicosDeLaEnfermedad() {
        return new ArrayList<>(estadosPatologicosDeLaEnfermedad);
    }

    public void setEstadosPatologicosDeLaEnfermedad(ArrayList<String> estadosPatologicosDeLaEnfermedad) {
        this.estadosPatologicosDeLaEnfermedad = new ArrayList<>(estadosPatologicosDeLaEnfermedad);
    }
}
