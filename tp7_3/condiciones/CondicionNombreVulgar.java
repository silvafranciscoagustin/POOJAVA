package tp7_3.condiciones;

import tp7_3.Condicion;
import tp7_3.FichaPlanta;

public class CondicionNombreVulgar extends Condicion {
    private String nombreVulgar;

    public CondicionNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    @Override
    public boolean cumple(FichaPlanta fp) {
        if(fp.getNombresVulgares().contains(this.nombreVulgar)){
            return true;
        }else{
            return false;
        }
    }
}
