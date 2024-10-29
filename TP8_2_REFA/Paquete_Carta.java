package TP8_2_REFA;

public class Paquete_Carta extends Envio {
    public Paquete_Carta( int nroTracking,String destino, String destinatario, String dirRemitente, String remitente, boolean aDomicilio, double peso) {
        super(nroTracking, destino, destinatario, dirRemitente, remitente, aDomicilio, peso);
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setNroTracking(int i) {
        this.nroTracking = i;
    }
}
