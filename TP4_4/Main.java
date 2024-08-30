package TP4_4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Futbolista f1 = new Futbolista("Fran", "Silva", "AB43SD3",
                LocalDate.of(1999, 6, 22), true, true,
                "CapoTotal", "Derecho", 12);


        Entrenador e1 = new Entrenador("Pedro", "Nox", "AD948373HD",
                LocalDate.of(1991, 4, 18),
                true, false, 23);

        Masajista m1 = new Masajista("Carlos", "WolfOfWallStreetAvendaño", "AD666666",
                LocalDate.of(1991, 2, 1), false, false,
                "Master en Garcologia", 1);



        System.out.println(f1.estaDisponible());
        System.out.println(e1.estaDisponible());
        System.out.println(m1.estaDisponible());
    }
}
