package tp6_3;

public class Barco {

    private int capacidadCarga;

    public Barco(int capacidadCarga){
        setCapacidadCarga(capacidadCarga);
    }

    public void cargar(){
        System.out.println("Se cargo el barco con capacidad" + capacidadCarga);
    }


    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
