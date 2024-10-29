package tp8_3;

public class FrutaPesoX10 extends FrutaProhibida{
    public FrutaPesoX10(String nombre) {
        super(nombre);
    }
    @Override
    public double calcularFuerza(double peso) {
        return peso*10.0;
    }
}
