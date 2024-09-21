package tp6_1;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Item item;
    private LocalDate fechaVencimiento;

    public Alquiler(Cliente cliente, Item item,LocalDate fechaVencimiento){
        //si el item con el que voy a instanciar el alquilar, se puede alquilar, que se cree, sino no.
        if(item.alquilar()){
            this.cliente = cliente;
            this.item = item;
            this.fechaVencimiento = fechaVencimiento;
        }
    }

    public boolean equals (Object o){
        Alquiler aa = (Alquiler) o;
        try{
            return aa.item.equals(this.getItem()) && aa.cliente.equals(this.getCliente()) && aa.getFechaVencimiento() == this.fechaVencimiento;
        } catch(Exception exc){
            return false;
        }
    }

    public boolean estaVencido(){
        return LocalDate.now().isAfter(this.fechaVencimiento);
    }

    public String toString(){
        return "se alquiló "+ item.getNombre();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
