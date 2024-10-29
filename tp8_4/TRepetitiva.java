package tp8_4;

public class TRepetitiva extends Tarea {
    private int vecesQueSeRepite;

    public TRepetitiva(String accionArealizar, double costo, int tiempoEstimado, int vecesQueSeRepite) {
        super(accionArealizar, costo, tiempoEstimado);
        this.vecesQueSeRepite = vecesQueSeRepite;
    }

    @Override
    public double getCosto() {
        return 0;
    }

    @Override
    public int getTiempoEstimado() {
        return 0;
    }

    @Override
    public int tiempoPorTarea() {
        return 0;
    }

    public int getVecesQueSeRepite() {
        return vecesQueSeRepite;
    }

    public void setVecesQueSeRepite(int vecesQueSeRepite) {
        this.vecesQueSeRepite = vecesQueSeRepite;
    }
}
