package tp6_1_nuevo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Alquiler> alquileres;
    private ArrayList<Item> items;

    public Videoclub(){
        alquileres = new ArrayList<Alquiler>();
        items = new ArrayList<Item>();
    }

    public void alquilarItem( Cliente cc,Item ii, LocalDate ff){
        if(ii.alquilar()){
        // Alquiler nuevoAlquiler = new Alquiler(cc,ii,ff);
            addAlquiler(new Alquiler(cc,ii,ff));
        }
    }


    public ArrayList<Cliente> getClientesConAlquileresVencidos(){
        ArrayList<Cliente> clientesVencidos = new ArrayList<Cliente>();
        for (Alquiler aa : alquileres) {
            if(aa.estaVencido() && !clientesVencidos.contains(aa.getCliente())){
                clientesVencidos.add(aa.getCliente());
            }
        }
        return clientesVencidos;
    }



    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<>(alquileres);
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = new ArrayList<>(alquileres);
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void setItems(ArrayList<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public void addAlquiler(Alquiler aa){
        this.alquileres.add(aa);
    }



}
