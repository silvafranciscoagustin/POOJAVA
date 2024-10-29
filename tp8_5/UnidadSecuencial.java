package tp8_5;

import java.util.ArrayList;

public class UnidadSecuencial extends Unidad{
    public UnidadSecuencial(String nombre) {
        super(nombre);
    }

    @Override
    public double getPuntaje() {
        double total = 0;
        for (Evaluacion unidad : unidades){
            total+=unidad.getPuntaje();
        }
        return total;
    }

    @Override
    public int getTiempoEstimado() {
        int total=0;
        for (Evaluacion unidad : unidades){
            total+=unidad.getTiempoEstimado();
        }
        return total;
    }

}
