package tp6_1;

public class Vehiculo extends Item{
    private String marca;
    private String patente;
    private int kms;
    private boolean estaAlquilado;

    public Vehiculo(String nombre, String descripcion,int precio, String marca,String patente,int kms){
        super(nombre,descripcion,precio);
        this.marca = marca;
        this.patente = patente;
        this.kms = kms;
        estaAlquilado = false;
    }

    public boolean alquilar(){
        if(estaDisponible()){
            return true;
        }
        return false;
    }

    public boolean estaDisponible(){
        if(!estaAlquilado){
            return true;
        }else{
            return false;
        }
    }

    public void devolver(Item i){
        Vehiculo vv = (Vehiculo) i;
        if(vv.equals(this)){
            estaAlquilado = false;
        }
    }

    public boolean equals(Object o ){
        Vehiculo vv = (Vehiculo) o ;
        try{
            return super.equals(o) && vv.getPatente().equalsIgnoreCase(this.getPatente());
        }catch (Exception exc){
            return false;
        }
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public boolean isEstaAlquilado() {
        return estaAlquilado;
    }

    public void setEstaAlquilado(boolean estaAlquilado) {
        this.estaAlquilado = estaAlquilado;
    }
}
