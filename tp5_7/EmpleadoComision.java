package tp5_7;

import java.util.ArrayList;

public class EmpleadoComision extends Empleado{
    private ArrayList<Venta> ventas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, String apellido, int dni, double sueldoMensual,double porcentajeComision){
        super(nombre,apellido,dni,sueldoMensual);
        setPorcentajeComision(porcentajeComision);
        this.ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta){
        this.ventas.add(venta);
    }
    public ArrayList<Venta> getVentas(){
        return new ArrayList<>(this.ventas);
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double montoTotalDeVentas(){
        double total = 0;
        for (Venta venta: ventas){
            total += venta.getMontoVenta();
        }
        return total;
    }

    public double getSueldoMensual(){
        double totalVentas = montoTotalDeVentas();
        double comision = totalVentas * porcentajeComision;
        return super.getSueldoMensual()+comision;
    }
}
