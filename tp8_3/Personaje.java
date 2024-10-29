package tp8_3;

public class Personaje extends Entidad {

    //tiene una forma distinta de calcular su fuerza, peso, y edad.
    private static double FUERZA_BASE = 125.0;
    private String nombre;
    private double fuerza;
    private int edad;
    private double peso;
    private FrutaProhibida fruta;

    public Personaje(String nombre, int edad, double peso,FrutaProhibida f) {
        super(nombre);
        setEdad(edad);
        setPeso(peso);
        setFuerza(getFuerza());
        setFruta(f);
    }

    public double getFuerza(){
        if(fruta == null){
            return FUERZA_BASE;
        }else{
             return fruta.calcularFuerza(peso)+FUERZA_BASE;
        }
    }

    public double getPeso() {
        return peso;
    }
    public int getEdad() {
        return edad;
    }




    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public FrutaProhibida getFruta() {
        return fruta;
    }

    public void setFruta(FrutaProhibida fruta) {
        this.fruta = fruta;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }




}
