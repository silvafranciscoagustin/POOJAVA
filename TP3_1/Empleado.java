package TP3_1;

public class Empleado extends Persona {
    private int cantEncRealizadas;
    public Empleado(String nombre, int dni){
        super(nombre,dni);
        this.cantEncRealizadas = 0;
    }


    public int getCantEncRealizadas() {
        return cantEncRealizadas;
    }

    public void setCantEncRealizadas(int cantEncRealizadas) {
        this.cantEncRealizadas = cantEncRealizadas;
    }
}
