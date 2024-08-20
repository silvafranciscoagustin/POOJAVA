package TP2_4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cancha {
    private int id;
    private String tipoCancha;
    private int precio;
    private boolean disponible;
    private LocalDateTime horaApertura;
    private LocalDateTime horaCierre;
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public Cancha(int id,String tipoCancha,int precio,LocalDateTime horaApertura, LocalDateTime horaCierre){
        setId(id);
        setTipoCancha(tipoCancha);
        setPrecio(precio);
        setHoraApertura(horaApertura);
        setHoraCierre(horaCierre);
        this.disponible = true;
    }

    public boolean estaDisponibleEnHorario(LocalDateTime horaInicioReserva, LocalDateTime horaFinReserva){
        // Verificar si el rango de la reserva está dentro del horario de apertura y cierre de la cancha
        if (horaInicioReserva.isBefore(horaApertura) || horaFinReserva.isAfter(horaCierre)) {
            return false;
        }
        for (int i = 0; i <reservas.size() ; i++) {
            Reserva reservaExistente = reservas.get(i);
            if(haySuperposicion(horaInicioReserva, horaFinReserva, reservaExistente.getHoraInicio(), reservaExistente.getHoraFin())){
                return false;
            }
        }
        return true;
    }

        public boolean haySuperposicion(LocalDateTime horaInicioReserva, LocalDateTime horaFinReserva, LocalDateTime horaInicioComparar,LocalDateTime horaFinComparar){
            return !(horaFinReserva.isBefore(horaInicioComparar) || horaFinComparar.isBefore(horaInicioReserva));
        }



    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public LocalDateTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalDateTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalDateTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalDateTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
