package tp6_2;

import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<Elemento> elementos;

    public ColaEspera(){
        elementos = new ArrayList<Elemento>();
    }

    public void agregarElemento(Elemento ee){
        int i = 0;
        while(!elementos.contains(ee) && elementos.size()> i){
            if(ee.esMenor(elementos.get(i))){
                elementos.add(i,ee);
            }
            i++;
        }
        if(!elementos.contains(ee)){
            elementos.add(ee);
        }
    }




    public Elemento getSiguiente() {
        if(!elementos.isEmpty()){
            return elementos.remove(0);
        }else return null;
    }


    public boolean tieneElementos() {
        return !elementos.isEmpty();
    }

    public ArrayList<Elemento> getElementos() {
        return new ArrayList<>(elementos);//devuelve copia
    }
}
