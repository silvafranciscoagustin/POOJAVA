package tp6_2;

public class Proceso extends Elemento {
    private int memoriaRequerida;

    public Proceso (int memoriaRequerida){
        setMemoriaRequerida(memoriaRequerida);
    }

    public boolean esMenor(Elemento pp){ return this.getMemoriaRequerida()< ((Proceso) pp).getMemoriaRequerida();}



    public int getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public void setMemoriaRequerida(int memoriaRequerida) {
        this.memoriaRequerida = memoriaRequerida;
    }
}
