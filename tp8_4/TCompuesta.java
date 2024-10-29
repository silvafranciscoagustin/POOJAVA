package tp8_4;

import java.util.ArrayList;

public class TCompuesta extends Tarea{
    private ArrayList<Tarea> tareas;

    public TCompuesta(String accionArealizar, double costo, int tiempoEstimado, ArrayList<Tarea> tareas) {
        super(accionArealizar, costo, tiempoEstimado);
        tareas = new ArrayList<>();
    }

    @Override
    public double getCosto() {
        double total = 0;
        for (Tarea t : tareas){
            total+= t.getCosto();
        }
        return total;
    }

    @Override
    public int tiempoPorTarea() {
        return 0;
    }

    @Override
    public int getTiempoEstimado() {
        int total = 0;
        for (Tarea t : tareas){
            total += t.getTiempoEstimado();
            total+= t.tiempoPorTarea();
        }
        return total;
    }

    public String listarAcciones(){
        String listado="";
        for (Tarea t : tareas){
            listado = listado.concat(", " + t.getAccionArealizar());
        }
        return listado;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

}
