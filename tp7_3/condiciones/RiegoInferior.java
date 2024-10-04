package tp7_3.condiciones;

import tp7_3.Condicion;
import tp7_3.FichaPlanta;

public class RiegoInferior extends Condicion {
    private int riegoIngerior; //getset

    public RiegoInferior(int riegoIngerior) {
        this.riegoIngerior = riegoIngerior;
    }

    @Override
    public boolean cumple(FichaPlanta fp) {
        if(fp.getRequerimientoDeAgua()<riegoIngerior){
            return true;
        }
        else return false;
    }
}
