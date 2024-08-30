package tp4_6;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona p){
        this.personas.add(p);
    }

    public void mostrarEmpleados(){
        for (Persona persona: personas) {
            System.out.println(persona.toString());
        }
    }


    public static void main(String[] args) {
        Empresa e1 = new Empresa();

        EmpleadoJerarquico empj1 = new EmpleadoJerarquico("Emp Jerarq","Uno",22,"Crack",12312,3000);
        UsuarioFinal uf1 = new UsuarioFinal("Usuario","Final",24,"KKK","USER112","aksdks");
        Empleado emp1 =  new Empleado("Empleado","Normal",23,"PadelHouse",24423,200.000);
        Persona p1 = new Persona("Persona","Original",25,"Programador");

        e1.agregarPersona(empj1);
        e1.agregarPersona(uf1);
        e1.agregarPersona(emp1);
        e1.agregarPersona(p1);

        e1.mostrarEmpleados();
    }
}
