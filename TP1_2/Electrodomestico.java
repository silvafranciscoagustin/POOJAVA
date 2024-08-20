package TP1_2;

public class Electrodomestico {
     private static double minKw = 45.0, highEndBalance = 3.0;
     private String name;
     private double basePrice;
     private String color;
     private double energyConsumption;
     private double weight;

     public Electrodomestico(String name, double basePrice, String color, double energyConsumption,double weight){
        setName(name);
        setBasePrice(basePrice);
        setColor(color);
        setEnergyConsumption(energyConsumption);
        setWeight(weight);
     }
    public Electrodomestico(String name, double basePrice, String color, double energyConsumption){
         this(name, basePrice,color,energyConsumption,2.0);
    }
    public Electrodomestico(String name, double basePrice, String color){
        this(name, basePrice,color,10.0);
    }
    public Electrodomestico(String name, double basePrice){
        this(name, basePrice,"Gris Plata");
    }
    public Electrodomestico(String name){
        this(name, 100.0);
    }
    public Electrodomestico(){this("Lavarropas");}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
    public boolean isLowConsumption(){
        return getEnergyConsumption() <= minKw;
    }
    //Calcular el balance, el mismo es el resultado de dividir el costo por el peso
    public double balance(){
         return getBasePrice()/getWeight();
    }
    //Indicar si un producto es de alta gama, el balance es mayor que 3
    public boolean isHighEnd(){
         return balance() > highEndBalance;
    }

    public String toString(){
         return "Nombre: " + getName()+ "\n" +
                 "Precio Base: $"+getBasePrice()+ "\n" +
                 "Color: "+getColor()+ "\n" +
                 "Consumo Electrico: "+getEnergyConsumption()+"kw"+ "\n" +
                 "Peso: "+getWeight()+"kg"+ "\n";
    }







}
