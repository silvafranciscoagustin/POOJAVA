package TP3_1;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Encuesta> encuestas = new ArrayList<>();
    private Empleado empleado;

    public Empresa(String nombre){
        this.encuestas = new ArrayList<>();
    }


    public void agregarEncuesta(Encuesta e){
        if(chequearDni(e) || encuestas.isEmpty()){
            encuestas.add(e);
            System.out.println("Agregamos a :"+ e.getPersona().getNombre());
        }else{
            System.out.println("La persona ya respondio: "+ e.getPersona().getDNI()+" "+e.getPersona().getNombre());
        }
    }


    public boolean chequearDni(Encuesta encuestaNueva){
        for (Encuesta encuesta: encuestas) {
            if(encuesta.getPersona().getDNI() == encuestaNueva.getPersona().getDNI()){
                return false;
            }
        }
       return true;
    }

    public int nroEncuestas(Empleado empleado){
        return empleado.getCantEncRealizadas();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }

    public void setEncuestas(ArrayList<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }
}
