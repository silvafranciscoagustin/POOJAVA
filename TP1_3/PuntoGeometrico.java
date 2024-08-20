package TP1_3;
public class PuntoGeometrico {
    private double x;
    private double y;

    public PuntoGeometrico(int x, int y){
        setX(x);
        setY(y);
    }
    public PuntoGeometrico(){
        this(0,0);
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

 //Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
    //del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
    //(cierto desplazamiento en X y cierto desplazamiento en Y).
    public void desplazar(double dx, double dy){
        x+=dx;
        y+=dy;
    }

    //Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
    //euclídea con otro punto acorde a la siguiente formula:
    // Distancia al cuadrado = ( X1 – X2 ) al cuadrado + (Y1 – Y2) al cuadrado
    // La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
    //cuadrada
    public double distanciaEuclidea(PuntoGeometrico otroPunto){
        double diferenciax = x - otroPunto.x;
        double diferenciay = y - otroPunto.y;
        return Math.sqrt(diferenciax * diferenciax + diferenciay * diferenciay);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
