package TP4_5;

import java.time.LocalDate;

public class ProductoRoC extends Producto{
    private int tempRecomendada;
    private int codAlmimenticio;

    public ProductoRoC(String nombre, LocalDate fechaVenc, int nroLote, String granjaOrigen, LocalDate fechaEnvasado, int tempRecomendada, int codAlmimenticio) {
        super(nombre, fechaVenc, nroLote, granjaOrigen, fechaEnvasado);
        this.tempRecomendada = tempRecomendada;
        this.codAlmimenticio = codAlmimenticio;
    }

    public int getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(int tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    public int getCodAlmimenticio() {
        return codAlmimenticio;
    }

    public void setCodAlmimenticio(int codAlmimenticio) {
        this.codAlmimenticio = codAlmimenticio;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Temperatura Recomendada: "+getTempRecomendada()+"\n"+
                "Codigo Alimenticio: "+ getCodAlmimenticio()+"\n";
    }
}
