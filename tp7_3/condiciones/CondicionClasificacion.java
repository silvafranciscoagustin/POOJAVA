package tp7_3.condiciones;

import tp7_3.Condicion;
import tp7_3.FichaPlanta;

public class CondicionClasificacion extends Condicion {
    private String clasificacionSuperior; //getset

    public CondicionClasificacion(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    @Override
    public boolean cumple(FichaPlanta fp) {
        if(fp.getClasifSuperior().equalsIgnoreCase(clasificacionSuperior)){
            return true;
        }else{
            return false;
        }
    }
}
