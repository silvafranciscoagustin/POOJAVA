package tp8_3;

public class FrutaFijax7 extends FrutaProhibida{
    private double valorFijo;

    public FrutaFijax7(String nombre,double valorFijo) {
        super(nombre);
        this.valorFijo = valorFijo;
    }
    @Override
    public double calcularFuerza(double peso) {return valorFijo+peso*7;}
}
