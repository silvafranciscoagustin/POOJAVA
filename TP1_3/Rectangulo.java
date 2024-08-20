package TP1_3;

public class Rectangulo {
    private PuntoGeometrico esquinaSupIzq;
    private PuntoGeometrico esquinaInfDer;
    private double base;
    private double altura;

    public Rectangulo(PuntoGeometrico esquinaSupIzq, PuntoGeometrico esquinaInfDer) {
        setEsquinaSupIzq(esquinaSupIzq);
        setEsquinaInfDer(esquinaInfDer);

        this.base = esquinaInfDer.getX()-esquinaSupIzq.getX();
        this.altura = esquinaSupIzq.getY()-esquinaInfDer.getY();
    }


    public PuntoGeometrico getEsquinaSupIzq() {
        return esquinaSupIzq;
    }

    public void setEsquinaSupIzq(PuntoGeometrico esquinaSupIzq) {
        this.esquinaSupIzq = esquinaSupIzq;
    }

    public PuntoGeometrico getEsquinaInfDer() {
        return esquinaInfDer;
    }

    public void setEsquinaInfDer(PuntoGeometrico esquinaInfDer) {
        this.esquinaInfDer = esquinaInfDer;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    //Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
    //Y, las esquinas son PuntosGeometricos por lo tanto accedo a las funciones de su clase,
    //ene esta caso desplazar;
    public void desplazar(double dx, double dy){
        esquinaSupIzq.desplazar(dx,dy);
        esquinaInfDer.desplazar(dx,dy);
    }
    //Calcular el Área del rectángulo
    public double calcularArea(){
        return getBase() * getAltura();
    }
    //Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
    //iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
    //del mismo es mayor que la del otro.
    public int comparar(Rectangulo otroRectangulo){
        double miArea = calcularArea();
        double otroArea = otroRectangulo.calcularArea();

        if(miArea>otroArea){return 1;}
        else if (miArea<otroArea) {return -1;}
        else {return 0;}
    }
    //Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
    //propiedades para que sea un cuadrado.

    //Al restar la base y la altura, podemos obtener un valor positivo, negativo o cero.
    // Si el valor absoluto de esta diferencia es menor que una tolerancia predefinida,
    // consideramos que la base y la altura son prácticamente iguales y, por lo tanto, el rectángulo es un cuadrado.
    //Si no queres usar math abs, tenes que escribir condicionales para manejar los casos positivos y negativos.
    public boolean esCuadrado(){
        double tolerancia = 0.0001;
        return Math.abs(getBase()-getAltura())<tolerancia;
    }
    //Determinar el largo del lado superior.
    public double ladoSuperior(){
        return getBase();
    }
    //Determinar si está acostado o parado (si el alto es más que el ancho).
    public boolean estaAcostado(){
        return getBase()>getAltura();
    }







}
