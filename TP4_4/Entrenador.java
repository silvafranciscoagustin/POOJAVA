package TP4_4;

import java.time.LocalDate;

public class Entrenador extends Persona {
    private int idFederacion;
    public Entrenador(String nombre, String apellido, String nroPasaporte, LocalDate fechaNac, boolean enPaisOrigen, boolean concentrando, int idFederacion) {
        super(nombre, apellido, nroPasaporte, fechaNac, enPaisOrigen, concentrando);
        setIdFederacion(idFederacion);
    }

    public void setIdFederacion(int id){
        this.idFederacion = id;
    }

    public int getIdFederacion() {
        return idFederacion;
    }
}
