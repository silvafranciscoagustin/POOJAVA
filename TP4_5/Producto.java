package TP4_5;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private LocalDate fechaVenc;
    private int nroLote;
    private String granjaOrigen;
    private LocalDate fechaEnvasado;

    public Producto(String nombre, LocalDate fechaVenc, int nroLote, String granjaOrigen, LocalDate fechaEnvasado) {
        this.nombre = nombre;
        this.fechaVenc = fechaVenc;
        this.nroLote = nroLote;
        this.granjaOrigen = granjaOrigen;
        this.fechaEnvasado = fechaEnvasado;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre()+"\n"+
                "Fecha Vencimiento: "+ getFechaVenc()+"\n"+
                "Numero de lote: "+ getNroLote()+"\n"+
                "Granja de origen: "+ getGranjaOrigen()+"\n"+
                "Fecha envasado: "+ getFechaEnvasado()+"\n";
    }
}
