package tp8_4;

public abstract class Tarea {
    private String accionArealizar;
    protected double costo;
    protected int tiempoEstimado;

    public Tarea(String accionArealizar, double costo,int tiempoEstimado){
        setAccionArealizar(accionArealizar);
        setCosto(costo);
        setTiempoEstimado(tiempoEstimado);
    }

    public abstract double getCosto();
    public abstract int getTiempoEstimado();
    public abstract int tiempoPorTarea();


    public String getAccionArealizar() {
        return accionArealizar;
    }

    public void setAccionArealizar(String accionArealizar) {
        this.accionArealizar = accionArealizar;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
}
