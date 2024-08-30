package TP4_3;

public class EmpleadoPorComision extends Empleado {
    private final double COMISION_POR_VENTA = 0.1;
    private int montoVenta;
    public EmpleadoPorComision(String nombre, double salarioFijoSemanal, int montoVenta){
        super(nombre,salarioFijoSemanal);
        setMontoVenta(montoVenta);
    }

    @Override
    public double getSalarioFijoSemanal() {
        double dineroPorComisiones = montoVenta * (COMISION_POR_VENTA);
        return super.getSalarioFijoSemanal() + dineroPorComisiones;
    }

    public double getCOMISION_POR_VENTA() {
        return COMISION_POR_VENTA;
    }

    public int getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(int montoVenta) {
        this.montoVenta = montoVenta;
    }
}
