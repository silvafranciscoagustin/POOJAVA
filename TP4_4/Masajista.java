package TP4_4;

import java.time.LocalDate;

public class Masajista extends Persona {
    private String tituloQuePosee;
    private int aniosExperiencia;


    public Masajista(String nombre, String apellido, String nroPasaporte, LocalDate fechaNac, boolean enPaisOrigen, boolean concentrando, String tituloQuePosee, int aniosExperiencia ) {
        super(nombre, apellido, nroPasaporte, fechaNac, enPaisOrigen, concentrando);
        setTituloQuePosee(tituloQuePosee);
        setAniosExperiencia(aniosExperiencia);
    }

    public String getTituloQuePosee() {
        return tituloQuePosee;
    }

    public void setTituloQuePosee(String tituloQuePosee) {
        this.tituloQuePosee = tituloQuePosee;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
