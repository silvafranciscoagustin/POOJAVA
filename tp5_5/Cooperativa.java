package tp5_5;

import java.util.ArrayList;

public class Cooperativa {
    private String nombre;
    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;
    private ArrayList<String> mineralesPrimarios;

    public Cooperativa(String nombre){
        setNombre(nombre);
        this.lotes = new ArrayList<>();
        this.cereales = new ArrayList<>();
        this.mineralesPrimarios = new ArrayList<>();
    }

    public void agregarMineralPrimario(String mineral){
        if(!mineralesPrimarios.contains(mineral)){
            mineralesPrimarios.add(mineral);
        }
    }
    public ArrayList<String> getMineralesPrimarios(){
        return new ArrayList<>(this.mineralesPrimarios);
    }

    public void agregarLoteACooperativa(Lote lote){
        if(!lotes.contains(lote)){
            lotes.add(lote);
        }
    }

    public void agregarCerealACooperativa(Cereal cereal){
        if(!cereales.contains(cereal)){
            cereales.add(cereal);
        }
    }

    public ArrayList<Cereal> getCerealesCooperativa(){
        return new ArrayList<>(this.cereales);
    }

    public ArrayList<Lote> getLotesCooperativa(){
        return new ArrayList<>(this.lotes);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cereal> cerealesPlantablesEnLote(Lote l){
        ArrayList<Cereal> arrayCereales = new ArrayList<>();
        for (Cereal cereal: cereales) {
            if(cereal.sePuedeSembrarEnLote(l)){
                arrayCereales.add(cereal);
            }
        }
        return arrayCereales;
    }


    public ArrayList<Lote> lotesDisponiblesParaCereal(Cereal c){
        ArrayList<Lote> arrayLotes = new ArrayList<>();
        for (Lote lote : lotes){
            if(lote.aptoParaSembrarCereal(c)){
                arrayLotes.add(lote);
            }
        }
        return arrayLotes;
    }


    public boolean esEspecial(Lote l) {
        return (l.getMineralesEnSuelo().containsAll(mineralesPrimarios));
    }


}
