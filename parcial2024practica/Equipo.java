package parcial2024practica;

import java.util.ArrayList;

public class Equipo extends ElementoVentas {
    protected ArrayList<ElementoVentas> elementos;

    public Equipo() {
        this.elementos = new ArrayList<>();
    }


    public ArrayList<ElementoVentas> getElementos() {
        return new ArrayList<>(elementos);
    }

    public void setElementos(ArrayList<ElementoVentas> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }

    @Override
    public double getGanancias() {
        double total=0;
        for (ElementoVentas elem : elementos){
            total += elem.getGanancias();
        }
        return total;
    }

    @Override
    public int getCantTotalProdVend() {
        int total = 0;
        for (ElementoVentas elem : elementos){
            total+= elem.getCantTotalProdVend();
        }
        return total;
    }

    @Override
    public int getCantidadTotalVentas() {
        int total = 0;
        for (ElementoVentas elem :elementos){
            total += elem.getCantidadTotalVentas();
        }
        return total;
    }

    @Override
    public ArrayList<Vendedor> buscar(Condicion c) {
        ArrayList<Vendedor> retorno = new ArrayList<>();
        for (ElementoVentas ee: elementos) {
            retorno.addAll(ee.buscar(c));
        }
        return retorno;
    }

    @Override
    public double getEdad() {
        double promedioEdad = 0;
        for (ElementoVentas vv: elementos) {
            promedioEdad+= vv.getEdad();
        }
        return promedioEdad/elementos.size();
    }
}
