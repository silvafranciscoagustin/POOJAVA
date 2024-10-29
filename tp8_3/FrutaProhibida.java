package tp8_3;

public abstract class FrutaProhibida{
    private String nombre;
    public FrutaProhibida(String nombre){
        this.nombre = nombre;
    }
    public abstract double calcularFuerza(double peso);

}


