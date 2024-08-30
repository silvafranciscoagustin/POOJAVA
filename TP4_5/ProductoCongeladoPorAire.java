package TP4_5;

import java.time.LocalDate;

public class ProductoCongeladoPorAire extends ProductoRoC{
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public ProductoCongeladoPorAire(String nombre, LocalDate fechaVenc, int nroLote, String granjaOrigen, LocalDate fechaEnvasado, int tempRecomendada, int codAlmimenticio, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(nombre, fechaVenc, nroLote, granjaOrigen, fechaEnvasado, tempRecomendada, codAlmimenticio);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public double getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }

    public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }

    public double getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(double porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }

    public double getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }

    public void setPorcentajeDioxidoCarbono(double porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }

    public double getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }

    public void setPorcentajeVaporAgua(double porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Porcentaje Oxigeno: "+ getPorcentajeOxigeno()+"\n"+
                "Porcentaje Dioxido: "+getPorcentajeDioxidoCarbono()+"\n"+
                "Porcentaje de Nitrogeno: "+ getPorcentajeNitrogeno()+"\n"+
                "Porcentaje Vapor de Agua: "+getPorcentajeVaporAgua();
    }
}
