package TP4_5;

import java.time.LocalDate;

public class ProductoCongeladoPorNitrogeno extends ProductoRoC{
    private String metodoCongUsado;
    private int tiempoExpNitrogeno;

    public ProductoCongeladoPorNitrogeno(String nombre, LocalDate fechaVenc, int nroLote, String granjaOrigen, LocalDate fechaEnvasado, int tempRecomendada, int codAlmimenticio, String metodoCongUsado, int tiempoExpNitrogeno) {
        super(nombre, fechaVenc, nroLote, granjaOrigen, fechaEnvasado, tempRecomendada, codAlmimenticio);
        this.metodoCongUsado = metodoCongUsado;
        this.tiempoExpNitrogeno = tiempoExpNitrogeno;
    }

    public String getMetodoCongUsado() {
        return metodoCongUsado;
    }

    public void setMetodoCongUsado(String metodoCongUsado) {
        this.metodoCongUsado = metodoCongUsado;
    }

    public int getTiempoExpNitrogeno() {
        return tiempoExpNitrogeno;
    }

    public void setTiempoExpNitrogeno(int tiempoExpNitrogeno) {
        this.tiempoExpNitrogeno = tiempoExpNitrogeno;
    }

    public String toString() {
        return super.toString()+
                "Metodo de Congelacion Usado: "+ getMetodoCongUsado()+"\n"+
                "Tiempo Expuesto Al Nitrogeno: "+ getTiempoExpNitrogeno()+ " Segundos";
    }
}
