package tp6_1;

public abstract class Item {
    private String nombre;
    private String descripcion;
    private int precio;

    public Item(String nombre, String descripcion, int precio){
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
    }

    public boolean equals(Object o){
        Item i = (Item) o;
        try{
            return i.getDescripcion().equalsIgnoreCase(this.getDescripcion()) && i.getNombre().equalsIgnoreCase(this.getNombre());
        }catch (Exception exc){
            return false;
        }
    }
    public abstract boolean alquilar();
    public abstract boolean estaDisponible();
    public abstract void devolver(Item i);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
