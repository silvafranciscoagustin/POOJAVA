package TP4_5;

import java.time.LocalDate;

public class ProductoCongeladoPorAgua extends ProductoRoC{
    private double gramosSal;
    private double litrosAgua;

    public ProductoCongeladoPorAgua(String nombre, LocalDate fechaVenc, int nroLote, String granjaOrigen, LocalDate fechaEnvasado, int tempRecomendada, int codAlmimenticio, int gramosSal, int litrosAgua) {
        super(nombre, fechaVenc, nroLote, granjaOrigen, fechaEnvasado, tempRecomendada, codAlmimenticio);
        this.gramosSal = gramosSal;
        this.litrosAgua = litrosAgua;
    }

    public double getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(double gramosSal) {
        this.gramosSal = gramosSal;
    }

    public double getLitrosAgua() {
        return litrosAgua;
    }

    public void setLitrosAgua(double litrosAgua) {
        this.litrosAgua = litrosAgua;
    }

    public double salinidadDelAgua(){
        return getGramosSal()/getLitrosAgua();
    }
}
