package TP2_3;

public class Impuesto {
    private String nombreImp;
    private double recaudado;

    public Impuesto(String nombre,double recaudado){
        setNombreImp(nombre);
        setRecaudado(recaudado);
    }

    public Impuesto(String nombre){
        this(nombre,0.0);
    }
    public Impuesto(){
        this("IMP GENERICO PARA PROBAR SIN NADA EKISDE");
    }

    public String getNombreImp() {
        return nombreImp;
    }

    public void setNombreImp(String nombreImp) {
        this.nombreImp = nombreImp;
    }

    public double getRecaudado() {
        return recaudado;
    }

    public void setRecaudado(double recaudado) {
        this.recaudado = recaudado;
    }
}
