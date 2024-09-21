package tp5_4;

import java.util.ArrayList;

public class Casa {
    protected ArrayList<String> cualidades;
    protected ArrayList<Alumno> alumnos;
    protected int cantMaxAlum;

    public Casa(int cantMaxAlum){
        setCantMaxAlum(cantMaxAlum);
        this.cualidades = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public void setCantMaxAlum(int c){
        this.cantMaxAlum = c;
    }

    public int getCantMaxAlum(){
        return cantMaxAlum;
    }

    public void addCualidad(String cualidad){
        cualidades.add(cualidad);
    }
    public ArrayList<String> getCualidades(){
        return new ArrayList<>(this.cualidades);
    }


    public void agregarAlumno(Alumno alum){
        if(alumnos.size() < cantMaxAlum && poseeCualidades(alum) && !alumnos.contains(alum)){//si hay menos alumnos que el maximo, si posee las cualidades, y si no esta ya agregado, lo agrego
            alumnos.add(alum);
            System.out.println("Se agrego alum: "+ alum.getNombre());
        }else{
            System.out.println("No se puede agregar por falta de lugar o cualidades."+ alum.getNombre());
        }
    }

    public boolean poseeCualidades(Alumno alum){
        for (String cualidad: cualidades) {
            if(!alum.getCualidades().contains(cualidad)){//si el alumno no tiene alguna de las cualidades, corta false.
                return false;
            }
        }
        return true;
    }







    




}
