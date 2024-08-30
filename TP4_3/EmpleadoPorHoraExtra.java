package TP4_3;

public class EmpleadoPorHoraExtra extends Empleado{
    private int horasExtra;
    private final double VALOR_HS_EXTRA = 120.0;
    public EmpleadoPorHoraExtra(String nombre,double salarioFijoSemanal, int horasExtra){
        super(nombre,salarioFijoSemanal);
        setHorasExtra(horasExtra);
    }

    @Override
    public double getSalarioFijoSemanal() {
        double salarioPorHorasExtras = horasExtra *  VALOR_HS_EXTRA;
        return super.getSalarioFijoSemanal() + salarioPorHorasExtras ;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getVALOR_HS_EXTRA() {
        return VALOR_HS_EXTRA;
    }
}
