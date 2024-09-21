package tp5_1;

import java.util.ArrayList;

public class Sistema {
    private String nombre;
    ArrayList<Planta> plantas = new ArrayList<>();

    public Sistema(String nombre) {
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

}
