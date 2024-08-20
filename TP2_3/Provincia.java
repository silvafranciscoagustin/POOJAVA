package TP2_3;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades = new ArrayList();


    public Provincia(String nombre){
        setNombre(nombre);
        setCiudades(ciudades);
    }


    public int cantCiudadesGrandes(){
        int cant = 0;
        for (int i = 0; i < ciudades.size(); i++) {
            if (ciudades.get(i).getHabitantes()>100000){
                cant++;
            }
        }
        return cant;
    }

    public int cantCiudEnDeficit(){
        int cant = 0;
        for (int i = 0; i < ciudades.size(); i++) {
            if(ciudades.get(i).getHabitantes()>100000 && ciudades.get(i).gastaDeMas()){
                cant++;
            }
        }
        return cant;
    }

    public boolean hayMayoriaEnDeficit(){
        return cantCiudEnDeficit() > cantCiudadesGrandes() / 2;
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
