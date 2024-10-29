package tp8_4;

public class TareaSimple extends Tarea{
    private static final int TIEMPO_EXTRA_POR_TAREA = 10;
    public TareaSimple(String accionArealizar, double costo, int tiempoEstimado) {
        super(accionArealizar, costo, tiempoEstimado);
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    @Override
    public int tiempoPorTarea() {
        return TIEMPO_EXTRA_POR_TAREA;
    }
}
