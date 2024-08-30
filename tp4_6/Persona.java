package tp4_6;

import java.time.LocalDate;

public class Persona {
    private String cargo;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona (String nombre, String apellido,int edad,String cargo){
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setCargo(cargo);
    }
    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return "Nombre: "+getNombre()+"\n"+
                "Apellido: "+getApellido()+"\n"+
                "Edad: "+getEdad()+"\n"+
                "Cargo: "+getCargo()+"\n"+
                "----------------------"+"\n";
    }
}
