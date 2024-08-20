package TP2_4;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Usuario {
    private static final int reservasParaSocio = 4,mesesParaReservasSocio=2;
    private String nombre;
    private boolean esSocio;
    private ArrayList<Reserva> reservas = new ArrayList();

    public Usuario(String nombre){
        setNombre(nombre);
        setReservas(reservas);
        setEsSocio(esSocio);
    }

    public void registrarReserva(Reserva r){
        reservas.add(r);
    }

    public boolean esSocio(){
        int cantResEnTiempo = 0;
        if(reservas.size()>4){
            for (int i = 0; i < reservas.size(); i++) {
                Period periodo = Period.between(reservas.get(i).getFecha() , LocalDate.now());
                if(periodo.getMonths() <= mesesParaReservasSocio){
                    cantResEnTiempo++;
                }
            }
        }
        if(cantResEnTiempo>=reservasParaSocio){
            return true;
        }else{
            return false;
        }
    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsSocio() {
        return esSocio;
    }

    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
}
