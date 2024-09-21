package tp5_5;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> mineralesRequeridos;
    public Cereal(String nombre){
        setNombre(nombre);
        this.mineralesRequeridos = new ArrayList<>();
    }

    public void agregarMineralRequerido(String mineral){
        if(!mineralesRequeridos.contains(mineral)){
            mineralesRequeridos.add(mineral.toLowerCase());
        }
    }

    public ArrayList<String> getMineralesRequeridos() {
        return new ArrayList<>(this.mineralesRequeridos);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean sePuedeSembrarEnLote(Lote l){
        return this.getMineralesRequeridos().containsAll(l.getMineralesEnSuelo());
    }
}
