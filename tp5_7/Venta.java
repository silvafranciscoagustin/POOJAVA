package tp5_7;

public class Venta {
    private int nroVenta;
    private int montoVenta;


    public Venta(int idVenta, int montoVenta) {
        setIdVenta(idVenta);
        setMontoVenta(montoVenta);
    }

    public boolean equals(Object o){
        Venta v= (Venta) o;
        try {
            return v.nroVenta==this.nroVenta;//se supone q el id es unico
        }catch (Exception exc){
            return false;
        }
    }


    public int getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(int montoVenta) {
        this.montoVenta = montoVenta;
    }

    public int getIdVenta() {
        return nroVenta;
    }

    public void setIdVenta(int nroVenta) {
        this.nroVenta = nroVenta;
    }
}
