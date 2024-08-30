package TP4_5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProductoCongeladoPorNitrogeno pcn1 = new ProductoCongeladoPorNitrogeno("Patitas de pollo", LocalDate.of(1999,6,22),123,"Granja del Sol",LocalDate.of(1299,2,12),-12,3444342,"Por agua",23);
        System.out.println(pcn1.toString());
    }
}
