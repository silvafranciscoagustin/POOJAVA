package ParcialQuequen;

import java.util.ArrayList;

public abstract class ElementoColeccionable  {
    private String nombre;


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



}
