package parcial2024practica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vendedor extends ElementoVentas {
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Venta> ventas;

    public Vendedor(String nombre, String apellido, int edad, ArrayList<Venta> ventas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ventas = ventas;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Venta> getVentas() {
        return new ArrayList<>(ventas);
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = new ArrayList<>(ventas);
    }

    @Override
    public double getGanancias() {
        double total = 0;
        for (Venta vv:ventas) {
            total+= vv.getGanancias();
        }
        return 0;
    }

    @Override
    public int getCantTotalProdVend() {
        int total = 0;
        for (Venta vv: ventas){
            total += vv.getCantVendido();
        }
        return total;
    }

    @Override
    public int getCantidadTotalVentas() {
        return ventas.size();
    }



    @Override
    public ArrayList<Vendedor> buscar(Condicion c) {
        ArrayList<Vendedor> retorno = new ArrayList();
        if(c.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }


    public boolean vendisteAlgo(LocalDate fi, LocalDate ff){
        for (int i = 0; i <= ventas.size();i++){
            if(ventas.get(i).getFechaVenta().compareTo(fi)<=0&&
                ventas.get(i).getFechaVenta().compareTo(ff)>=0){
                return true;
            }
        }
        return false;
    }

    public boolean vendiste(String codigo){
        for (Venta v : ventas){
            if (v.getCodigoProducto() == codigo){return true;}
        }
        return false;
    }
}
