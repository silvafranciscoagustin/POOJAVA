package TP4_3;

public class Main {
    public static void main(String[] args) {
            Empleado e1 = new Empleado("Empleado comun",3500);
            EmpleadoPorComision empc1 = new EmpleadoPorComision("Nico por comision",3000,3000);
            EmpleadoPorHoraExtra emphx1 = new EmpleadoPorHoraExtra("Quique por hs xtra",3000,4);

            Sistema s1 = new Sistema("Soluciones Integrales Basurto");
            System.out.println(e1.getNombre()+" "+s1.calcularSalario(e1));
            System.out.println(empc1.getNombre()+" "+s1.calcularSalario(empc1));
            System.out.println(emphx1.getNombre()+" "+s1.calcularSalario(emphx1));
    }
}
