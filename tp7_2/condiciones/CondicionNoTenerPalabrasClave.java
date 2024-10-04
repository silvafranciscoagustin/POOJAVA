package tp7_2.condiciones;

import tp7_2.Condicion;
import tp7_2.Documento;

public class CondicionNoTenerPalabrasClave extends Condicion {
    @Override
    public boolean cumple(Documento d) {
       return d.getPalabrasClaves().isEmpty(); // si esta vacio retorna true
    }
}
