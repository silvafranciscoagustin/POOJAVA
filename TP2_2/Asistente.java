package TP2_2;

public class Asistente {
    private String nombre;
    private String nroTelef;
    private String email;

    public Asistente(String nombre, String nroTelef,String email){
        setNombre(nombre);
        setNroTelef(nroTelef);
        setEmail(email);
    }
    public Asistente(String nroTelef, String email){
        this("NN",nroTelef,email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroTelef() {
        return nroTelef;
    }

    public void setNroTelef(String nroTelef) {
        this.nroTelef = nroTelef;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
