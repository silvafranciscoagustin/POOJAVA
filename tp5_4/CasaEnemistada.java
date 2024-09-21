package tp5_4;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {
    private ArrayList<Casa> casasEnemigas;
    public CasaEnemistada(int cantMaxAlum){
        super(cantMaxAlum);
        this.casasEnemigas = new ArrayList<>();
    }

    public ArrayList<Casa> getCasasEnemigas() {
        return casasEnemigas;
    }

    public void agregarCasaEnemiga(Casa casaEnemiga) {
        casasEnemigas.add(casaEnemiga);
    }

    public void agregarAlumno(Alumno alum){
        for(Casa casaEnemiga : casasEnemigas){
            if(!casaEnemiga.alumnos.contains(alum)){
                super.agregarAlumno(alum);
            }
        }
    }
}
