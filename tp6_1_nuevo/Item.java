package tp6_1_nuevo;

public  abstract class Item {
    protected int cantCopias;

    public Item (int cantCopias){
        setCantCopias(cantCopias);
    }

    public abstract void setCantCopias(int cc);
    public boolean isDisponible(){
        return this.cantCopias >0;
    }

    public boolean alquilar(){
        if(isDisponible()){
            this.cantCopias--;
            return true;
        }
        return false;
    }

    public int getCantCopias() {
        return cantCopias;
    }
}


