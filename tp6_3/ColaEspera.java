package tp6_3;

import java.util.ArrayList;

public abstract class ColaEspera {

    private ArrayList<Object> elementos;

    public ColaEspera(){
        this.elementos = new ArrayList<>();
    }

    public void addObjeto(Object objeto){
        int i = 0;
        while(i< elementos.size() && this.comparar(this.elementos.get(i), objeto)){
            i++;
        }
        if(i<elementos.size()){
            elementos.add(i, objeto);
        }else {
            elementos.add(objeto);
        }
    }

    public boolean hayElementos(){
        return !elementos.isEmpty();
    }

    public Object getPrimero(){
        if(hayElementos()){
            return elementos.get(0);
        }
        else return null;
    }

    public void borrarPrimero(){
        if(hayElementos()){
            elementos.remove(getPrimero());
        }
    }







    public abstract boolean comparar(Object e1, Object e2);



    public ArrayList<Object> getElementos() {
        return new ArrayList<>();
    }

    public void setElementos(ArrayList<Object> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }

    public void addObject(Object o){
        this.elementos.add(o);
    }
}
