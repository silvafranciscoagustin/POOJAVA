package tp6_3;

public class ColaEsperaCamion extends ColaEspera {
    @Override
    public boolean comparar(Object e1, Object e2) {
        return ( (Camion) e1).getFechaCarga().isBefore( ((Camion)e2).getFechaCarga());
    }
}
