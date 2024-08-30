package TP4_4;

import java.time.LocalDate;

public class Futbolista extends Persona{
    private String posicion;
    private String pieHabil;
    private int cantGoles;
    public Futbolista(String nombre, String apellido, String nroPasaporte, LocalDate fechaNac, boolean enPaisOrigen, boolean concentrando,String posicion,String pieHabil,int cantGoles){
        super(nombre,apellido,nroPasaporte,fechaNac,enPaisOrigen,concentrando);
        setPosicion(posicion);
        setPieHabil(pieHabil);
        setCantGoles(cantGoles);
    }


    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }

}
