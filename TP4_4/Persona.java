package TP4_4;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String nroPasaporte;
    private LocalDate fechaNac;
    private boolean enPaisOrigen;
    private boolean concentrando;


    public Persona(String nombre, String apellido, String nroPasaporte,LocalDate fechaNac,boolean enPaisOrigen,boolean concentrando){
        setNombre(nombre);
        setApellido(apellido);
        setNroPasaporte(nroPasaporte);
        setFechaNac(fechaNac);
        setEnPaisOrigen(enPaisOrigen);
        setConcentrando(concentrando);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroPasaporte() {
        return nroPasaporte;
    }

    public void setNroPasaporte(String nroPasaporte) {
        this.nroPasaporte = nroPasaporte;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isEnPaisOrigen() {
        return enPaisOrigen;
    }

    public void setEnPaisOrigen(boolean enPaisOrigen) {
        this.enPaisOrigen = enPaisOrigen;
    }

    public boolean isConcentrando() {
        return concentrando;
    }

    public void setConcentrando(boolean concentrando) {
        this.concentrando = concentrando;
    }

    public boolean estaDisponible(){
        return enPaisOrigen && !concentrando;
    }

}
