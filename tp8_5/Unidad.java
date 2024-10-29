package tp8_5;

import java.text.Normalizer;
import java.util.ArrayList;

public abstract class Unidad extends Evaluacion{
    protected String nombre;
    protected ArrayList<Evaluacion> unidades;

    public Unidad(String nombre) {
        setNombre(nombre);
        unidades = new ArrayList<>();
    }
    @Override
    public abstract double getPuntaje();

    @Override
    public abstract int getTiempoEstimado();

    public ArrayList<String> getListadoDeConceptosMesas(){
        // creo lista donde almacenar conceptos
        // recorro toda la unidad/pregunta, y por cada lista de conceptos voy a ...
            // recorrer todos los conceptos de la lista, y por cada concepto voy a....
                // si el concepto no esta en nuestra lista declarada al inicio..
                    //lo agregamos
                        //retornar la lista
        ArrayList<String> listaNR = new ArrayList<>();
        for (Evaluacion elem : unidades){
            for (int i = 0; i < elem.getListadoDeConceptos().size(); i++) {
                if(!listaNR.contains(elem.getListadoDeConceptos().get(i))){
                    listaNR.add(elem.getListadoDeConceptos().get(i));
                }
            }
        }
        return listaNR;
    }
    public  ArrayList<String> getListadoDeConceptos(){
        ArrayList <String> listaSinRepetir = new ArrayList<>(); //creo lista para retornar


        //entro a cada Unidad/pregunta
        for (Evaluacion unidad : unidades){
            // aca estan todos los conceptos de cada unidad o pregunta en la que estoy parado
            ArrayList<String> conceptosAver = unidad.getListadoDeConceptos();
            for (String concepto: conceptosAver){ // de los conceptos que tengo guardados en este momento , de la unidad que estoy parado
                if (!listaSinRepetir.contains(concepto)){// me fijo uno por uno, si mi lista,lo tiene, y si no
                    listaSinRepetir.add(concepto); // lo agrego
                }
            }
        }
        return listaSinRepetir; // devuelvo la lista
    }

    public ArrayList<String> getListadoDeCosasSinRepetir(){
        ArrayList<String> listadoSR = new ArrayList<>(); //creo arreglo donde guardar cosas
        for (Evaluacion elem : unidades){ // recorro en este caso / unidades o preguntas
            ArrayList<String> cosaSinRepetir = elem.getListadoDeConceptos(); //guardo sus cosas que quiero verificar
            for (String cosa : cosaSinRepetir){
                if(!listadoSR.contains(cosa)){
                    listadoSR.add(cosa);
                }
            }
        }
        return listadoSR;
    }







    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Evaluacion> getUnidades() {
        return new ArrayList<>(unidades);
    }

    public void setUnidades(ArrayList<Evaluacion> unidades) {
        this.unidades = new ArrayList<>(unidades);
    }
}
