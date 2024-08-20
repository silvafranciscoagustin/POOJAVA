package TP2_2;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion {
    private String lugar;
    private String tema;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private ArrayList<Asistente> asistentes = new ArrayList<>();

    public Reunion(String lugar, String tema,LocalDateTime horaInicio, LocalDateTime horaFin){
        setLugar(lugar);
        setTema(tema);
        setHoraInicio(horaInicio);
        setHoraFin(horaFin);
        setAsistentes(asistentes);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
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

    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(ArrayList<Asistente> asistentes) {
        if(asistentes== null){
            throw new IllegalArgumentException("La lista de asistentes no puede ser vacia.");
        }
        this.asistentes = asistentes;
    }
}
