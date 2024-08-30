package TP3_2;

import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList<Mueble> muebles = new ArrayList();
    private final double porcentajeVenta = 1.35;

    public Fabrica(String nombre){
        setNombre(nombre);
        this.muebles = new ArrayList<>();
    }


    public int getStock(){
        return muebles.size();
    }

    public double calcCostoProductosEnStock(){
        double costo = 0;
        for(Mueble mueble : muebles){
            costo+= mueble.getCostoDeFabricacion();
        }
        return costo;
    }

    public double calcPrecioVentaEnStock(){
        double precioVenta = 0;
        for(Mueble mueble : muebles){
            precioVenta += mueble.getCostoDeFabricacion()*porcentajeVenta;
        }
        return precioVenta;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mueble> getMuebles() {
        return muebles;
    }

    public void setMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }
}
