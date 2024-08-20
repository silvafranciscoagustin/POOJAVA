package TP2_3;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias = new ArrayList<>();

    public Pais(String nombre){
        setNombre(nombre);
        setProvincias(provincias);
    }

    public int cantProvinciasConCiudadesEnDeficit(){
        int cant = 0;
        for (int i = 0; i < provincias.size(); i++) {
            if(provincias.get(i).hayMayoriaEnDeficit()){
                cant++;
            }
        }
        return cant;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }
}
