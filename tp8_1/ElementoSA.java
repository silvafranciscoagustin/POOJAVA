package tp8_1;

import tp6_2.Elemento;

import java.time.LocalDate;

public abstract class ElementoSA {
    private String nombre;
    private LocalDate fechaCreacion;

    public ElementoSA(String nombre, LocalDate fechaCreacion){
        setNombre(nombre);
        setFechaCreacion(fechaCreacion);
    }

    public abstract int getTamanio();

    protected abstract int cantElementos();


    public boolean equals(Object o) {
        try {
            ElementoSA that = (ElementoSA) o;
            return nombre.equals(that.getNombre());
        } catch (Exception e){
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
