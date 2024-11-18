package ParcialQuequen;


import java.util.ArrayList;

public class Coleccion extends ElementoColeccionable {
    protected ArrayList<ElementoColeccionable> elementos;
    private static final double PORCENTAJE_EXTRA = 0.1;

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
            if(ee.getValor()==1){
                total += ee.getVolumen() + (ee.getVolumen() * PORCENTAJE_EXTRA);
            }else {
                ee.getVolumen();
            }
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
    public double getCosto(){
        double total = 0;
        for (ElementoColeccionable ee: elementos){
            total+=ee.getCosto();
        }
        return total;
    }



    @Override
    public int getValor() {
        return 0;
    }

    public ArrayList<ElementoColeccionable> getElementos() {
        return new ArrayList<>(elementos);
    }

    public void setElementos(ArrayList<ElementoColeccionable> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }


}
