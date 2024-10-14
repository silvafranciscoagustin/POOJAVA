package tp8_2;

public class Paquete extends Envio {
    private String destinatario;
    private String destino;
    private String remitente;
    private String origen;
    private String aDomicilioOSucursal;
    private double peso;

    public Paquete(int nroUnicoTracking, String destinatario, String destino, String remitente, String origen, String aDomicilioOSucursal, int peso) {
        super(nroUnicoTracking);
        setDestinatario(destinatario);
        setDestino(destino);
        setRemitente(remitente);
        setOrigen(origen);
        setaDomicilioOSucursal(aDomicilioOSucursal);
        setPeso(peso);
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getaDomicilioOSucursal() {
        return aDomicilioOSucursal;
    }

    public void setaDomicilioOSucursal(String aDomicilioOSucursal) {
        this.aDomicilioOSucursal = aDomicilioOSucursal.toLowerCase();
    }
}
