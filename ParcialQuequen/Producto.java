package ParcialQuequen;

import java.util.ArrayList;

public class Producto extends ElementoColeccionable {
    private double peso, volumen;
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
        return null;
    }

    @Override
    public double getCosto() {
        return 0;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
