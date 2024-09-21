package tp5_8;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private ArrayList<Cualidad> cualidadesEvaluador;
    private ArrayList<Trabajo> trabajosDelEmpleado;

    public Evaluador(String nombre){
        setNombre(nombre);
        this.cualidadesEvaluador=new ArrayList<>();
        this.trabajosDelEmpleado =new ArrayList<>();
    }

    public ArrayList<Trabajo> getTrabajosDelEmpleado() {
        return new ArrayList<>(this.trabajosDelEmpleado);
    }

    public void setTrabajosDelEmpleado(Trabajo t) {
        this.trabajosDelEmpleado.add(t);
    }


    public ArrayList<Cualidad> getCualidades() {
        return new ArrayList<>(this.cualidadesEvaluador);
    }

    public void setCualidades(Cualidad c) {
        this.cualidadesEvaluador.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
