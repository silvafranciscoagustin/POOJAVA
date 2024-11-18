package RECUTRESARROYOS2023;

import RECUTRESARROYOS2023.condicion.Condicion;

import java.util.ArrayList;

public  abstract class ElementoEducativo {

    private  String nombre;

    public ElementoEducativo(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract ArrayList<String> getDocentesAcargo();

    public abstract int cantCursos();
    public abstract int getHorasCatedra();
    public abstract ArrayList<Curso> buscar(Condicion c);
    public abstract Curso cursoMasCaro();

    public String getNombre() {
        return nombre;
    }

    public boolean contienePalabra(String palabra) {
        return this.getPalabrasClave().contains(palabra);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
