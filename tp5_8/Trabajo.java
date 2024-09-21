package tp5_8;

import java.util.ArrayList;

public class Trabajo {
    private String nombreTrabajo;
    private ArrayList<Cualidad> cualidadesTrabajo;

    public Trabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
        cualidadesTrabajo = new ArrayList<>();
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

    public ArrayList<Cualidad> getCualidadesTrabajo() {
        return new ArrayList<>(this.cualidadesTrabajo);
    }

    public void setCualidadesTrabajo(Cualidad c) {
        cualidadesTrabajo.add(c);
    }
}
