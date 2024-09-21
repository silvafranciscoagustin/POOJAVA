package tp5_7;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private double sueldoMensual;

    public Empleado(String nombre, String apellido, int dni, double sueldoMensual) {
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setSueldoMensual(sueldoMensual);
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public boolean equals(Object o){
        Empleado e =  (Empleado) o ;
        try{
            return e.getDni() == this.getDni();
        }catch (Exception exc){
            return false;
        }
    }


}

