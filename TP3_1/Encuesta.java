package TP3_1;

import java.util.ArrayList;

public class Encuesta {
    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private Persona persona;
    private Empleado empleado;

    public Encuesta(Persona p,Empleado e){
        setPersona(p);
        setEmpleado(e);
        this.preguntas = new ArrayList<>();
        e.setCantEncRealizadas(this.empleado.getCantEncRealizadas()+1);
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
