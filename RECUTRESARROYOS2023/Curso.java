package RECUTRESARROYOS2023;


import RECUTRESARROYOS2023.condicion.Condicion;

import java.util.ArrayList;

public class Curso extends ElementoEducativo {
    private ArrayList<String> docentesAcargo;
    private ArrayList<String> palabrasClave;
    private double precio;

    public Curso(String nombre, double precio) {
        super(nombre);
        setPrecio(precio);
    }

    @Override
    public ArrayList<String> getDocentesAcargo() {
        return new ArrayList<>(docentesAcargo);
    }

    @Override
    public int cantCursos() {
        return 0;
    }

    @Override
    public int getHorasCatedra() {
        return 0;
    }

    @Override
    public ArrayList<Curso> buscar(Condicion c) {
        ArrayList<Curso> curso =  new ArrayList<>();
        if(c.cumple(this)){
            curso.add(this);
        }
        return curso;
    }


    @Override
    public Curso cursoMasCaro() {
        return this;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void addPalabra(String p){
        if(!palabrasClave.contains(p)){
            palabrasClave.add(p);
        }
    }
    public void addDocente(String d){
        if(!palabrasClave.contains(d)){
            palabrasClave.add(d);
        }
    }

    public void setDocentesAcargo(ArrayList<String> docentesAcargo) {
        this.docentesAcargo = new ArrayList<>(docentesAcargo);;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        this.palabrasClave = new ArrayList<>(palabrasClave);
    }
}
