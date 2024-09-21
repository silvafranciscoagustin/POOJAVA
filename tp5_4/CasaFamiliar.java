package tp5_4;

import java.util.ArrayList;

public class CasaFamiliar extends Casa {
    public CasaFamiliar(int cantMaxAlum){
        super(cantMaxAlum);
    }

    @Override
    public void agregarAlumno(Alumno alum) {

        for(Alumno familiar : alum.getFamiliares()){
           if(this.alumnos.contains(familiar)){
               super.agregarAlumno(alum);
               break;
           }
        }
    }
}
