package parcial2024practica;

import java.time.LocalDate;

public class CondicionFecha extends Condicion{
    private LocalDate fi,ff;


    @Override
    public boolean cumple(Vendedor vv) {
        return vv.vendisteAlgo(ff,fi);
    }
}
