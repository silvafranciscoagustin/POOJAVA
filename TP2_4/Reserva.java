package TP2_4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {
    private static final double descuentoParaSocio = 0.1;
    private LocalDate fecha;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private Usuario usuario;
    private Cancha cancha;

    public Reserva(LocalDate fecha,LocalDateTime horaInicio, LocalDateTime horaFin,Usuario usuario,Cancha cancha){
       setFecha(fecha);
       setHoraInicio(horaInicio);
       setHoraFin(horaFin);
       setUsuario(usuario);
       setCancha(cancha);
    }

    public int calcularCosto(Cancha cc, Usuario uu){
        Duration duracion = Duration.between(horaInicio,horaFin);
        double horas = duracion.toHours();
        double descuento = usuario.esSocio() ? descuentoParaSocio : 0;
        return (int) (cc.getPrecio() * horas * (1 - descuento ));
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
