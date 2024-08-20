package TP2_4;

import java.util.ArrayList;

public class Establecimiento {

    private ArrayList<Reserva> reservas =  new ArrayList<>();
    private ArrayList<Usuario> usuarios =  new ArrayList<>();
    private ArrayList<Cancha>  canchas = new ArrayList<>();


    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    public void reservarCancha(Reserva rr, Usuario uu,Cancha cc){
        if(cc.estaDisponibleEnHorario(rr.getHoraInicio(), rr.getHoraFin())  ){
            uu.registrarReserva(rr);
            rr.calcularCosto(cc,uu);
            System.out.println("Cancha: "+cc.getTipoCancha()+" Costo: "+ cc.getPrecio());

        }else{
            throw new IllegalArgumentException("Hay un turno reservado en ese horario");
        }

    }


    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }



    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
