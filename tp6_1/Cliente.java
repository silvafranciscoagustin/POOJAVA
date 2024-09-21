package tp6_1;

public class Cliente {
    private String nombre;
    private int dni;

    public Cliente (String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public boolean equals(Object o){
        Cliente cc=(Cliente)o;
        try{
            return cc.getDni() == this.getDni();
        }catch (Exception exc){
            return false;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
