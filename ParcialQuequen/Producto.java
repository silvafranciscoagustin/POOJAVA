package ParcialQuequen;

import java.util.ArrayList;

public class Producto extends ElementoColeccionable {
    private double peso, volumen;
    private static double costoUnidad = 15,precioxGramo = 10;
    private ArrayList<String> caracteristicas;
    public Producto(String nombre, double peso, double volumen) {
        super(nombre);
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public ArrayList<String> getCaracteristicas() {
        return new ArrayList<>(caracteristicas);
    }

    @Override
    public double getCosto() {
        return getCostoUnidad() * (getPeso() + getPrecioxGramo());
    }


    @Override
    public int getValor() {
        return 1;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public static double getCostoUnidad() {
        return costoUnidad;
    }

    public static void setCostoUnidad(double costoUnidad) {
        Producto.costoUnidad = costoUnidad;
    }

    public static double getPrecioxGramo() {
        return precioxGramo;
    }

    public static void setPrecioxGramo(double precioxGramo) {
        Producto.precioxGramo = precioxGramo;
    }
}
