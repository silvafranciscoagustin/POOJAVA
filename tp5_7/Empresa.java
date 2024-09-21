package tp5_7;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        setNombre(nombre);
        this.empleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<>(this.empleados);
    }


    public void addEmpleado(Empleado e) {
        if (!empleados.contains(e)) {
            empleados.add(e);
        }
    }

    public double getCostoTotalDeSueldos(){
        double total = 0;
        for(Empleado e : empleados){
            total += e.getSueldoMensual();
        }
        return total;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
