package RECUTRESARROYOS2023;

public class EspecializacionPremium extends Especializacion{
    public EspecializacionPremium(String nombre) {
        super(nombre);
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (ElementoEducativo e: elementos){
            total += e.getPrecio();
        }
        return total;
    }
}
