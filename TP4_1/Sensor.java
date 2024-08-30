package TP4_1;

public class Sensor {
    private String nombre;
    private boolean activado;

    public Sensor(String nombre){
        setNombre(nombre);
    }
    public void activar(){
        this.activado = true;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }
}
