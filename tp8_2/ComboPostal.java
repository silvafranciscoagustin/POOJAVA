package tp8_2;

import java.util.ArrayList;

public class ComboPostal extends Envio {
    private ArrayList<Envio> envios;

    public ComboPostal(int tracking, ArrayList<Envio> envios) {
        super(tracking);
        this.envios = new ArrayList<>();
    }

    public void addEnvio(Envio e){
        e.setTracking(this.getTracking());
        e.setOrigen(this.getOrigen());
        e.setDestino(this.getDestino());
        envios.add(e);
    }
    public void setTracking(int tracking){
        for (Envio envio : envios) {
            envio.setTracking(tracking);
        }
    }


    public String getOrigen(){
        return envios.get(0).getOrigen();
    }

    @Override
    public void setOrigen(String origen) {
        for (Envio envio : envios) {
            envio.setOrigen(origen);
        }
    }





    @Override
    public void setDestino(String destino) {


        for (Envio envio : envios) {
            envio.setDestino(destino);
        }

    }
    public String getDestino() {
        return envios.get(0).getDestino();
    }




    @Override
    public double getPeso() {
        double total = 0.0;
        for(Envio e: envios){
            total+= e.getPeso();
        }
        return total;
    }



    public ArrayList<Envio> getEnvios() {
        return new ArrayList<>(envios);
    }

    public void setEnvios(ArrayList<Envio> envios) {
        this.envios = new ArrayList<>(envios);
    }
}
