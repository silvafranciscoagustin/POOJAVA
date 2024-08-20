package TP2_2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Asistente asistente1 = new Asistente("2494","aaa@aaa.com");
        Asistente asistente2 = new Asistente("Carlos", "2494009989","carlosaa@pomail.com");


        Reunion reunion1= new Reunion("Sala 3","Presupuesto", LocalDateTime.of(2024,8,15,15,20),LocalDateTime.of(2024,8,15,20,20));
        Reunion reunion1Superpone= new Reunion("Sala 3","Presupuesto", LocalDateTime.of(2024,8,15,19,00),LocalDateTime.of(2024,8,15,20,50));
        Reunion reunion2 = new Reunion("Sala 3","Presupuesto", LocalDateTime.of(2024,8,15,8,20),LocalDateTime.of(2024,8,15,9,20));
        Reunion reunion3= new Reunion("Sala 3","Presupuesto", LocalDateTime.of(2024,8,15,14,20),LocalDateTime.of(2024,8,15,1,20));


        AgendaPersonal agenda1 = new AgendaPersonal("Agenda 1");
        agenda1.agregarReunion(reunion1);
        agenda1.agregarReunion(reunion2);
        agenda1.agregarReunion(reunion1Superpone);


        System.out.println(agenda1.getReuniones());
    }
}
