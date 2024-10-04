package tp7_2.condiciones;

import tp7_2.Condicion;
import tp7_2.Documento;

public class CondicionPorPalabraOFrase extends Condicion {
    private String palabraOFrase;

    public CondicionPorPalabraOFrase(String palabraOFrase){
        this.palabraOFrase = palabraOFrase;
    }
    @Override
    public boolean cumple(Documento d) {
        for (String pof:d.getPalabrasClaves()) {
            if(pof.equalsIgnoreCase(palabraOFrase)){
                return true;
            }
        }
        return false;
    }

}
