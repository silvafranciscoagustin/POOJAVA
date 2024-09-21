package tp5_1;

import java.time.LocalDate;

public class Planta {
    private static int contadorPlantas = 1;
    private String nombreCientifico;
    private String nombreComun;
    private String paisOrigen;
    private LocalDate fechaCompra;
    private int id;

    public Planta(String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.paisOrigen = paisOrigen;
        this.fechaCompra = fechaCompra;
        this.id = contadorPlantas++;
    }

    public static int getContadorPlantas() {
        return contadorPlantas;
    }

    public static void setContadorPlantas(int contadorPlantas) {
        Planta.contadorPlantas = contadorPlantas;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
