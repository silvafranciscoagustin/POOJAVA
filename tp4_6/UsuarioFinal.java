package tp4_6;

import TP2_4_REFACTOR.Usuario;

public class UsuarioFinal extends Persona{
    private String nombreUsuario;
    private String password;

    public UsuarioFinal(String nombre, String apellido, int edad,String cargo,String nombreUsuario,String password){
        super(nombre,apellido,edad, cargo);
        setNombreUsuario(nombreUsuario);
        setPassword(password);
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
