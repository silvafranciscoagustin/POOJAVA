package tp7_3.condiciones;

import tp7_3.Condicion;
import tp7_3.FichaPlanta;

public class SolSuperiorRiegoInferior extends Condicion {
    private int solSuperior;
    private int riegoInferior;  //getset

    public SolSuperiorRiegoInferior(int solSuperior, int riegoInferior) {
        this.solSuperior = solSuperior;
        this.riegoInferior = riegoInferior;
    }

    @Override
    public boolean cumple(FichaPlanta fp) {
        if(fp.getRequerimientoDeSol()>solSuperior && fp.getRequerimientoDeAgua()<riegoInferior){
            return true;
        }else {
            return false;
        }
    }
}
