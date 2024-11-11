package parcial2024practica;

public class EquipoPeterPan extends Equipo{

    @Override
    public double getEdad() {
        double menor = 0;
        if(elementos.size()>0){
            menor = elementos.get(0).getEdad();
        }
        for (ElementoVentas ee:elementos) {
            double aux = ee.getEdad();
            if(aux<menor){
                menor = aux;
            }
        }
        return menor;
    }

}
