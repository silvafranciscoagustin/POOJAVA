package TP4_1;

import java.util.ArrayList;

public class Alarma {
    ArrayList<Sensor> sensores = new ArrayList<>();

    //private Timbre timbre;


    public void comprobar(){
        for (Sensor sensor: sensores) {
            if(sensor.isActivado()){
                // timbre.hacerSonar(); suena el timbre
                System.out.println("Zona afectada: "+sensor.getNombre());
            }
        }
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
}
