package TP4_3;

public class Empleado {
    private String nombre;
    private double salarioFijoSemanal;

    public Empleado(String nombre,double salarioFijoSemanal){
        setNombre(nombre);
        setSalarioFijoSemanal(salarioFijoSemanal);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioFijoSemanal() {
        return salarioFijoSemanal;
    }

    public void setSalarioFijoSemanal(double salarioFijoSemanal) {
        this.salarioFijoSemanal = salarioFijoSemanal;
    }
}
