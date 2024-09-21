package tp5_8;

import java.util.ArrayList;

public class Sistema {
    private String nombre;
    private ArrayList<Trabajo> trabajos;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Cualidad> cualidadesExperto;


    public Sistema(String nombre) {
        setNombre(nombre);
        trabajos = new ArrayList<>();
        evaluadores = new ArrayList<>();
        cualidadesExperto = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Evaluador> getEvaluadores() {
        return new ArrayList<>(this.evaluadores);
    }

    public void setEvaluador(Evaluador e) {
        evaluadores.add(e);
    }

    public ArrayList<Trabajo> getTrabajos() {
        return new ArrayList<>(this.trabajos);
    }

    public void setTrabajo(Trabajo t) {
        trabajos.add(t);
    }

    public boolean esEvaluadorExperto(Evaluador e) {
        return e.getCualidades().containsAll(cualidadesExperto);
    }

    public ArrayList<Evaluador> evaluadoresDisponiblesParaTrabajo(Trabajo t) {
        ArrayList<Evaluador> evaluadoresDisponibles = new ArrayList<>();
        for (Evaluador e : evaluadores) {
            if (e.getCualidades().containsAll(t.getCualidadesTrabajo())) {
                evaluadoresDisponibles.add(e);
            }
        }
        return evaluadoresDisponibles;
    }

    public ArrayList<Trabajo> trabajosDisponiblesParaEvaluador(Evaluador e) {
        ArrayList<Trabajo> trabajosDisponibles = new ArrayList<>();
        for (Trabajo t : trabajos) {
            if (t.getCualidadesTrabajo().containsAll(e.getCualidades())) {
                trabajosDisponibles.add(t);
            }
        }
        return trabajosDisponibles;
    }
}
