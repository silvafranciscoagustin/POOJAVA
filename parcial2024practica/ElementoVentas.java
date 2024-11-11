package parcial2024practica;

import java.util.ArrayList;

public abstract class ElementoVentas {
    public abstract double getGanancias();
    public abstract int getCantTotalProdVend();
    public abstract int getCantidadTotalVentas();
    public abstract ArrayList<Vendedor> buscar(Condicion c);
    public abstract double getEdad();

}
