package tp8_3;

import java.util.ArrayList;

public class Barco extends Entidad {
    private ArrayList<Entidad> entidades;

    public Barco(String nombre,ArrayList<Tripulacion> tripulaciones) {
        super(nombre);
        tripulaciones = new ArrayList<>();
    }

    @Override
    public double getFuerza() {
        double totalFuerza = 0;
        for (Entidad ee: entidades){
            totalFuerza+=ee.getFuerza();
        }
        return totalFuerza;
    }

    @Override
    public double getPeso() {
        if(entidades.isEmpty()) return 0;
        else return entidades.get(0).getPeso();
    }

    @Override
    public int getEdad() {
        int edadMayor = 0;
        for (Entidad ee: entidades){
            if(ee.getEdad() > edadMayor){
                edadMayor = ee.getEdad();
            }
        }
        return edadMayor;
    }
}
