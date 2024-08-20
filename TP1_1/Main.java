package TP1_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("pepe","colgate",25, LocalDate.of(1999,06,22),
                41767853,"Bastante",85.0,190.0);

        System.out.println(p1.toString());

    }
}
