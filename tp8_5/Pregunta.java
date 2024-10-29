package tp8_5;

import java.util.ArrayList;

public class Pregunta extends Evaluacion{
    private String enunciado;
    private double puntaje;
    private int tiempoEstimado;
    private ArrayList<String> conceptos;

    public Pregunta(String enunciado, double puntaje, int tiempoEstimado, ArrayList<String> conceptos) {
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempoEstimado = tiempoEstimado;
        conceptos = new ArrayList<>();
    }

    @Override
    public double getPuntaje() {
        return 0;
    }

    @Override
    public int getTiempoEstimado() {
        return 0;
    }

    @Override
    public ArrayList<String> getListadoDeConceptos() {
        return null;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public ArrayList<String> getConceptos() {
        return new ArrayList<>(conceptos);
    }

    public void setConceptos(ArrayList<String> conceptos) {
        this.conceptos = new ArrayList<>(conceptos);
    }






    public ArrayList<String> getListadoDeConceptosAprender(){
        ArrayList<String> listaSinRepetidos = new ArrayList<>();
        for (Evaluacion unidad: unidades){
            //de todas las unidades/ que tengo voy una por una y guardo sus colores/palabras/conceptos/ en un array temporal
            ArrayList<String> conceptosANoRepetir = unidad.getListadoDeConceptos();
            // con esos conceptos/colores/palabras, miro si estan en mi lista sin repetidos, si no estan los agrego
            for (String concepto : conceptosANoRepetir){
                if(!listaSinRepetidos.contains(concepto)){
                    listaSinRepetidos.add(concepto);
                }
            }
        }
        return listaSinRepetidos;
    }

}
