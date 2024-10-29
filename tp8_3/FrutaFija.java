package tp8_3;

public class FrutaFija extends FrutaProhibida{
    private double valorFijo;

    public FrutaFija(String nombre, double valorFijo) {
        super(nombre);
        this.valorFijo = valorFijo;
    }

    public double getValorFijo() {
        return valorFijo;
    }
    @Override
    public double calcularFuerza(double peso) {return valorFijo;}
}
