package TP3_3;

public class Personaje {
    private String nombreReal;
    private String nombreSuper;
    private String superPoder;
    private int velocidad;
    private int fuerza;
    private int edad;


    public Personaje(String nombreReal, String nombreSuper, String superPoder, int velocidad,int fuerza,int edad){
        setNombreReal(nombreReal);
        setNombreSuper(nombreSuper);
        setSuperPoder(superPoder);
        setVelocidad(velocidad);
        setFuerza(fuerza);
        setEdad(edad);
    }



    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
