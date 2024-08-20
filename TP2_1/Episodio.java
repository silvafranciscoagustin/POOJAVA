package TP2_1;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private double calificacion;

    public Episodio(String titulo,String descripcion,boolean visto, double calificacion){
        setTitulo(titulo);
        setDescripcion(descripcion);
        setVisto(visto);
        setCalificacion(calificacion);
    }
    public Episodio(String titulo,String descripcion,boolean visto){
        this(titulo,descripcion,visto,0);
    }
    public Episodio(String titulo,String descripcion){
        this(titulo,descripcion,false);
    }
    public Episodio(String titulo){
        this(titulo,"No hay descripcion");
    }
    public Episodio(){
        this("Episodio Sin Datos");
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if(!isVisto()) {this.calificacion = -1.0;}
            else if (calificacion < 0 || calificacion > 5) {
                throw new IllegalArgumentException("La calificación es del 1 al 5.");}

        else this.calificacion = calificacion;
    }

    //Ingresar la calificación de un episodio. Si el valor ingresado como calificación
    //no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior
    public void calificarEpisodio(double calificacion){
            setCalificacion(calificacion);
    }


}
