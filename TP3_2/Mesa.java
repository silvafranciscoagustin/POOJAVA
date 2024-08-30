package TP3_2;

public class Mesa extends Mueble {
    //esto lo hago porque cada mesa puede tener sus propios atributos mas allá de los normales, que tiene cada mueble

    public Mesa(String nombre, String tipoDeMadera, String color, double peso, double costoDeFabricacion, double valorDeVenta){
        super(nombre,tipoDeMadera,color,peso,costoDeFabricacion,valorDeVenta);
    }
}
