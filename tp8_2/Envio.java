package tp8_2;

public abstract class Envio {
    private int tracking;

    public Envio(int tracking) {
        setTracking(tracking);
    }

    public abstract double getPeso();
    public abstract void setDestino(String dest);
    public abstract void setOrigen(String origen);
    public abstract String getOrigen();
    public abstract String getDestino();



    public int getTracking() {
        return tracking;
    }

    public void setTracking(int tracking) {
        this.tracking = tracking;
    }
}
