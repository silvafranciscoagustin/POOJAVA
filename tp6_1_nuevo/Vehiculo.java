package tp6_1_nuevo;

public class Vehiculo extends Item{
    private String marca;
    private double kms;
    private String patente;
    private String tipoMotor;

    public Vehiculo(int cantCopias, String marca, double kms, String patente, String tipoMotor) {
        super(cantCopias);
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
        setTipoMotor(tipoMotor);
    }


    public void setCantCopias(int cc){
        if(cc >= 0 && cc<=1){
            this.cantCopias = cc;
        }
    }





    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        // limitar a los 3 tipos de motores
        this.tipoMotor = tipoMotor;
    }
}
