package ParcialQuequen;

import java.util.ArrayList;

public abstract class ElementoColeccionable  {
    private String nombre;
    private static double costoUnidad = 15,precioxGramo = 10;

    public ElementoColeccionable(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPeso();
    public abstract double getVolumen();
    public abstract ArrayList<String> getCaracteristicas();
    public abstract double getCosto();
    public abstract int getValor();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static double getCostoUnidad() {
        return costoUnidad;
    }

    public static void setCostoUnidad(double costoUnidad) {
        ElementoColeccionable.costoUnidad = costoUnidad;
    }

    public static double getPrecioxGramo() {
        return precioxGramo;
    }

    public static void setPrecioxGramo(double precioxGramo) {
        ElementoColeccionable.precioxGramo = precioxGramo;
    }

}
