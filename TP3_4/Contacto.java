package TP3_4;

import java.time.LocalDate;

public class Contacto {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private int nroTel;
    private String direccion;
    private String email;
    private String ciudad;

    public Contacto(String nombre, String apellido,LocalDate fechaNac, int nroTel,String direccion,String email,String ciudad){
        setNombre(nombre);
        setApellido(apellido);
        setFechaNac(fechaNac);
        setNroTel(nroTel);
        setDireccion(direccion);
        setEmail(email);
        setCiudad(ciudad);
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public String getCiudad(){
        return ciudad;
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getNroTel() {
        return nroTel;
    }

    public void setNroTel(int nroTel) {
        this.nroTel = nroTel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
