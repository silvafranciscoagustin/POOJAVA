package tp8_5;

import java.util.ArrayList;

public class UnidadOptativa extends Unidad{
    public UnidadOptativa(String nombre) {
        super(nombre);
    }

    @Override
    public double getPuntaje() {
        double puntajeMax = 0;
        for (Evaluacion unidad : unidades){
            if(unidad.getPuntaje()>puntajeMax){
                puntajeMax = unidad.getPuntaje();
            }
        }
        return puntajeMax;
    }

    @Override
    public int getTiempoEstimado() {
        int tiempoMasAlto = 0;
        for (Evaluacion unidad : unidades){
            if(unidad.getTiempoEstimado()>tiempoMasAlto){
                tiempoMasAlto = unidad.getTiempoEstimado();
            }
        }
        return tiempoMasAlto;
    }

}
