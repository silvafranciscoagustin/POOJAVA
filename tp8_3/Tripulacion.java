package tp8_3;

import java.util.ArrayList;

public class Tripulacion extends Entidad  {
    //tiene una forma distinta de calcular su fuerza, peso, y edad.
    private ArrayList<Personaje> personajes;
    public Tripulacion(String nombre){
        super(nombre);
        personajes = new ArrayList<>();
    }

    @Override
    public double getFuerza() {
        double total = 0.0;
        for (Personaje pp : personajes){
            total+=pp.getFuerza();
        }
        return total;
    }

    @Override
    public double getPeso() {
        return personajes.get(0).getPeso();
    }

    @Override
    public int getEdad() {
        int edadMayor = 0;
        for (Personaje p : personajes){
            if(p.getEdad() > edadMayor){
                edadMayor=p.getEdad();
            }
        }
        return edadMayor;
    }

    public int obtenerCantTripulantes(){
        return personajes.size();
    }

}
