package tp5_5;

import java.util.ArrayList;

public class Lote {
    private String nombre;
    private int hectareas;
    private ArrayList<String> mineralesEnSuelo;

    public Lote(String nombre, int hectareas){
        setNombre(nombre);
        setHectareas(hectareas);
        this.mineralesEnSuelo = new ArrayList<>();
    }



    public void setMineralEnSuelo(String mineral){
        if(!mineralesEnSuelo.contains(mineral)){
            mineralesEnSuelo.add(mineral.toLowerCase());
        }
    }

    public ArrayList<String> getMineralesEnSuelo(){
        return new ArrayList<>(this.mineralesEnSuelo);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }

    public boolean aptoParaSembrarCereal(Cereal c){
        return this.getMineralesEnSuelo().containsAll(c.getMineralesRequeridos());
    }
}
