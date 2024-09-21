package tp6_1;

import TP4_3.Sistema;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaAlquiler {
    private ArrayList<Cliente> clientes;
    private ArrayList<Alquiler> alquileres;

    public SistemaAlquiler(){
        clientes  = new ArrayList<Cliente>();
        alquileres = new ArrayList<Alquiler>();
    }

    public ArrayList<Cliente> getClientes(){
        return new ArrayList<>(clientes);
    }
    public ArrayList<Alquiler> getItems(){
        return new ArrayList<>(alquileres);
    }

    public void agregarCliente(Cliente cc){
        if(!clientes.contains(cc)){
            clientes.add(cc);
        }
    }

    public void agregarAlquiler(Alquiler aa){
        if (!alquileres.contains(aa)){
            alquileres.add(aa);
        }
    }

    public ArrayList<Cliente> listarVencidos(){
        ArrayList<Cliente> clientesVencidos = new ArrayList<Cliente>();
        for (Alquiler alquiler: alquileres) {
            if(alquilerVencido(alquiler)){
                clientesVencidos.add(alquiler.getCliente());
            }
        }
        return clientesVencidos;
    }


        public boolean alquilerVencido(Alquiler a){
            return a.estaVencido();
        }
}
