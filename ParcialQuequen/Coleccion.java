package ParcialQuequen;


import java.util.ArrayList;

public class Coleccion extends ElementoColeccionable {
    protected ArrayList<ElementoColeccionable> elementos;

    public Coleccion(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    @Override
    public double getPeso() {
        double total = 0;
        for (ElementoColeccionable ee: elementos) {
            total += ee.getPeso();
        }
        return total;
    }

    @Override
    public double getVolumen() {
        double total = 0;
        for(ElementoColeccionable ee: elementos){
            total += ee.getVolumen();
        }
        return total;
    }

    @Override
    public ArrayList<String> getCaracteristicas() {
        ArrayList <String> caracteristicasSinRepetir = new ArrayList<>();
        for(ElementoColeccionable ee : elementos){
            ArrayList<String> caracteristicas = ee.getCaracteristicas();
            for (String caracteristica : caracteristicas){
                if(!caracteristicasSinRepetir.contains(caracteristica)){
                    caracteristicasSinRepetir.add(caracteristica);
                }
            }
        }
        return caracteristicasSinRepetir;
    }

    @Override
    public double getCosto() {
        return 0;
    }

    public ArrayList<ElementoColeccionable> getElementos() {
        return new ArrayList<>(elementos);
    }

    public void setElementos(ArrayList<ElementoColeccionable> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }


}
