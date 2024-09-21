package tp6_1;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Pelicula p= new Pelicula("interestelar","viajecitos en el espacio",4000,"blablabla",2);
        Vehiculo a= new Vehiculo("camaro","el de transformers",50000,"chevrolet","AOK444",234000);
        Cliente c= new Cliente("luchito",3500000);
        SistemaAlquiler s=new SistemaAlquiler();
        Alquiler al=new Alquiler(c,p, LocalDate.of(2023,12,01));

        s.agregarAlquiler(al);
        System.out.println(s.alquilerVencido(al));
        System.out.println("lista alquileres vencidos");
        System.out.println(s.listarVencidos());
        System.out.println("--------------------");
        System.out.println(al);
    }
}
