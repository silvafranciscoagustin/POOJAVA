package parcial2024practica;

import java.time.LocalDate;

public class Venta {
    private LocalDate fechaVenta;
    private String codigoProducto;
    private int dniVendedor;
    private double montoVendido;
    private int cantVendido;

    public Venta(LocalDate fechaVenta, String codigoProducto, int dniVendedor, double montoVendido, int cantVendido) {
        this.fechaVenta = fechaVenta;
        this.codigoProducto = codigoProducto;
        this.dniVendedor = dniVendedor;
        this.montoVendido = montoVendido;
        this.cantVendido = cantVendido;
    }


    public double getGanancias() {
        return cantVendido*montoVendido;
    }



    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getDniVendedor() {
        return dniVendedor;
    }

    public void setDniVendedor(int dniVendedor) {
        this.dniVendedor = dniVendedor;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        this.montoVendido = montoVendido;
    }

    public int getCantVendido() {
        return cantVendido;
    }

    public void setCantVendido(int cantVendido) {
        this.cantVendido = cantVendido;
    }
}
