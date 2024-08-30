package TP4_3;

public class Sistema {
    private String nombre;
    private Empleado empleado;

    public Sistema(String nombre){
        setNombre(nombre);
    }


    public double calcularSalario(Empleado ee){
        return ee.getSalarioFijoSemanal();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
