package tp6_3;

public class ColaEsperaBarco extends ColaEspera{

    @Override
    public boolean comparar(Object e1, Object e2) {
        return ( ((Barco) e1).getCapacidadCarga() > ((Barco)e2).getCapacidadCarga());
    }
}
