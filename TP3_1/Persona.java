package TP3_1;

public class Persona {
    private String nombre;
    private final int DNI;

    public Persona(String nombre, final int DNI){
        setNombre(nombre);
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getDNI() {
        return DNI;
    }
}
