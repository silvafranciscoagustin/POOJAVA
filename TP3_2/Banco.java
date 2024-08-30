package TP3_2;

public class Banco extends Mueble{

    //esto lo hago porque cada banco puede tener sus propios atributos mas allá de los normales, que tiene cada mueble
    public Banco (String nombre, String tipoDeMadera, String color, double peso, double costoDeFabricacion, double valorDeVenta){
        super(nombre,tipoDeMadera,color,peso,costoDeFabricacion,valorDeVenta);
    }
}
