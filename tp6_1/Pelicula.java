package tp6_1;

import java.security.PublicKey;

public class Pelicula extends Item{
    private String infoFilmografica;
    private int cantCopias;

    public Pelicula(String nombre, String descripcion, int precio,String infoFilmografica, int cantCopias){
        super(nombre, descripcion,precio);
        setInfoFilmografica(infoFilmografica);
        setCantCopias(cantCopias);
    }

    public  boolean alquilar(){
        if(estaDisponible()){
            restarCantCopias();
            return true;
        }
        return false;
    }


    public boolean estaDisponible(){
        return cantCopias>0;
    }

    public void devolver(Item p){
        Pelicula pe = (Pelicula) p;
        if(pe.equals(this)){
            sumarCantCopias();
        }
    }

    public boolean equals(Object o){
        Pelicula p = (Pelicula) o ;
        try {
            return super.equals(o) && p.getInfoFilmografica().equalsIgnoreCase(this.getInfoFilmografica());
        }
        catch (Exception exc){
            return false;
        }
    }

    public void  restarCantCopias(){
        cantCopias--;
    }
    public void sumarCantCopias(){
        cantCopias++;
    }





    public String getInfoFilmografica() {
        return infoFilmografica;
    }

    public void setInfoFilmografica(String infoFilmografica) {
        this.infoFilmografica = infoFilmografica;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }
}
