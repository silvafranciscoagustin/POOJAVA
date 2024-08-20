package TP1_2;

public class Main {
    public static void main(String[] args) {
        Electrodomestico lavarropas = new Electrodomestico("Whirpool",485.0,"White",
                200.0,50.0);
        System.out.println(lavarropas.toString());
        System.out.println(lavarropas.isHighEnd());
        System.out.println(lavarropas.balance());

    }
}
