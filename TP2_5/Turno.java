package TP2_5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Turno {
    private LocalDateTime fechaHora;
    private Peluquero peluquero;
    private Cliente cliente;
    private double precio;

    public Turno( LocalDate fecha, int hora, int minuto,Peluquero peluquero, Cliente cliente){
        setFechaHora(fecha.atTime(hora,minuto));
        setPeluquero(peluquero);
        setCliente(cliente);
    }



    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }

    public void setPeluquero(Peluquero peluquero) {
        this.peluquero = peluquero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
