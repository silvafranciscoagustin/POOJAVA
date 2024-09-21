package tp6_2;

public class Computadora extends Elemento {
    private int velocidad;
    private Proceso proceso;

    public Computadora(int memoriaDisponible){
        setVelocidad(memoriaDisponible);
    }

    public boolean esMenor(Elemento cc){
        return this.getVelocidad()< ((Computadora) cc).getVelocidad();
    }

    public void ejecutarProceso(Proceso p1) {
        this.proceso = p1;
    }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
