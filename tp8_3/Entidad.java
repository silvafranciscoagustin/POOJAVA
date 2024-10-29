package tp8_3;

public abstract class Entidad {
    private String nombre;

    public Entidad(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getFuerza();
    public abstract double getPeso();
    public abstract int getEdad();
}
