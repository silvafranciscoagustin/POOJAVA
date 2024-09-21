package tp6_3;

import java.time.LocalDate;

public class Camion {
    private LocalDate fechaCarga;

    public Camion(LocalDate fechaCarga){
        setFechaCarga(fechaCarga);
    }

    public void descargar(){
        System.out.println("Se descargo el camion con la fecha de carga: "+fechaCarga);
    }


    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }
}
