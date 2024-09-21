package tp5_5;

public class Pastura extends Cereal{
    private int cantMinimaHectareas;
    public Pastura(String nombre, int cantMinimaHectareas){
        super(nombre);
        setCantMinimaHectareas(cantMinimaHectareas);
    }


    @Override
    public boolean sePuedeSembrarEnLote(Lote l) {
        if(l.getHectareas()>= cantMinimaHectareas){
            return super.sePuedeSembrarEnLote(l);
        }else{
            return false;
        }
    }

    public int getCantMinimaHectareas() {
        return cantMinimaHectareas;
    }

    public void setCantMinimaHectareas(int cantMinimaHectareas) {
        this.cantMinimaHectareas = cantMinimaHectareas;
    }
}
