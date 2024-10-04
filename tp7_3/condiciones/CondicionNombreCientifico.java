package tp7_3.condiciones;

import tp7_3.Condicion;
import tp7_3.FichaPlanta;

public class CondicionNombreCientifico extends Condicion {
    private String nombreCientifico; //getyset

    public CondicionNombreCientifico(String nombreCientifico){
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public boolean cumple(FichaPlanta fp) {
        if(fp.getNombreCientifico().contains(this.nombreCientifico)){ //si dice incluya es contains!!
            return true;
        }else {return false;
        }
    }
}
