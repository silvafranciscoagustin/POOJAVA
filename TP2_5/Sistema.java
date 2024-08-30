package TP2_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Peluquero> peluqueros = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Turno> turnos = new ArrayList<>();
    private boolean frecuente;


    public Sistema(){
        this.peluqueros = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public static void main(String[] args) {
        Peluquero p1 = new Peluquero("Mati");
        Cliente c1 = new Cliente("Fran");
        Turno t1 = new Turno(LocalDate.of(2024,8,21),20,00,p1,c1);
        System.out.println(t1.getFechaHora());
    }
    public void registrarTurno(Turno nuevoTurno){
        boolean puedeRegistrar = true;
        for (int i = 0; i < turnos.size(); i++) {
           Turno turnoF = turnos.get(i);
           if(turnoF.getFechaHora().isBefore(nuevoTurno.getFechaHora().plusHours(1))){
                puedeRegistrar = false;
                break;
           }
        }

        if(puedeRegistrar) turnos.add(nuevoTurno);
        else System.out.println("Un nuevo turno tiene que registrarse 1 hs despues del ultimo");
    }

    public void buscarPrimerTurnoDisponible(){
        LocalDateTime ahora = LocalDateTime.now();
        Turno primerTurnoDisponible = null;
        for(Turno turno : turnos){
            LocalDateTime turnoHora = turno.getFechaHora();
            if(turnoHora.isBefore(ahora.plusHours(1))){

            }
        }
    }



    public boolean esFrecuente(){
        return true;
    }





    public ArrayList<Peluquero> getPeluqueros() {
        return peluqueros;
    }

    public void setPeluqueros(ArrayList<Peluquero> peluqueros) {
        this.peluqueros = peluqueros;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
}
