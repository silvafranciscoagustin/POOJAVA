package tp7_3.condiciones;

import tp7_3.Condicion;
import tp7_3.FichaPlanta;

public class SolInferiorRiegoSuperior extends Condicion {
    private int solInferior;
    private int riegoSuperior;  //getset

    public SolInferiorRiegoSuperior(int solInferior, int riegoSuperior) {
        this.solInferior = solInferior;
        this.riegoSuperior = riegoSuperior;
    }

    @Override
    public boolean cumple(FichaPlanta fp) {
        if(fp.getRequerimientoDeSol()<solInferior && fp.getRequerimientoDeAgua()> riegoSuperior){
            return true;
        }else {
            return false;
        }
    }
}

