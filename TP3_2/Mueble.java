package TP3_2;
public class Mueble {
    private String nombre;
    private double valorDeVenta;
    private double costoDeFabricacion;
    private double peso ;
    private String tipoDeMadera;
    private String color;

    public Mueble(String nombre, String tipoDeMadera, String color, double peso, double costoDeFabricacion, double valorDeVenta){
        setNombre(nombre);
        setTipoDeMadera(tipoDeMadera);
        setColor(color);
        setPeso(peso);
        setCostoDeFabricacion(costoDeFabricacion);
        setValorDeVenta(valorDeVenta);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorDeVenta() {
        return valorDeVenta;
    }

    public void setValorDeVenta(double valorDeVenta) {
        this.valorDeVenta = valorDeVenta;
    }

    public double getCostoDeFabricacion() {
        return costoDeFabricacion;
    }

    public void setCostoDeFabricacion(double costoDeFabricacion) {
        this.costoDeFabricacion = costoDeFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoDeMadera() {
        return tipoDeMadera;
    }

    public void setTipoDeMadera(String tipoDeMadera) {
        this.tipoDeMadera = tipoDeMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
