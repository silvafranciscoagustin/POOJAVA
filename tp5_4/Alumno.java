package tp5_4;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades = new ArrayList<>();
    private ArrayList<Alumno> familiares = new ArrayList<>();

    public Alumno(String nombre){
        setNombre(nombre);
        cualidades =  new ArrayList<>();
        familiares = new ArrayList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCualidad(String cualidad){
        cualidades.add(cualidad);
    }
    public ArrayList<String> getCualidades(){return new ArrayList<>(this.cualidades);
    }

    public void setFamiliar(Alumno familiar){
        familiares.add(familiar);
    }
    public ArrayList<Alumno> getFamiliares(){
        return new ArrayList<>(this.familiares);
    }






}
