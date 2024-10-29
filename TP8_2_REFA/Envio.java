package TP8_2_REFA;

public abstract class Envio{
    protected int nroTracking;
    protected String destino;
    protected String destinatario;
    protected String dirRemitente;
    protected String remitente;
    protected boolean aDomicilio;

    protected double peso;

    public Envio(int nroTracking,String destino, String destinatario, String dirRemitente, String remitente, boolean aDomicilio, double peso) {
        this.nroTracking = nroTracking;
        setDestino(destino);
        setDestinatario(destinatario);
        setDirRemitente(dirRemitente);
        setRemitente(remitente);
        setaDomicilio(aDomicilio);
        setPeso(peso);
    }

    public int getNroTracking() {
        return nroTracking;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDirRemitente() {
        return dirRemitente;
    }

    public void setDirRemitente(String dirRemitente) {
        this.dirRemitente = dirRemitente;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public boolean isaDomicilio() {
        return aDomicilio;
    }

    public void setaDomicilio(boolean aDomicilio) {
        this.aDomicilio = aDomicilio;
    }

    public abstract double getPeso();
    public abstract void setNroTracking(int nroTracking);




    public void setPeso(double peso) {
        this.peso = peso;
    }
}
