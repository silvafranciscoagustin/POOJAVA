package TP8_2_REFA;

import javax.crypto.EncryptedPrivateKeyInfo;
import java.lang.invoke.DelegatingMethodHandle$Holder;
import java.util.ArrayList;

public class ComboPostal extends Envio{
    private ArrayList<Envio> envios;

    public ComboPostal(int nroTracking, String destino, String destinatario, String dirRemitente, String remitente, boolean aDomicilio, double peso) {
        super(nroTracking, destino, destinatario, dirRemitente, remitente, aDomicilio, peso);
    }

    /*Todos los envíos poseen un único número de tracking que permite hacer su seguimiento. En
los combos el tracking es el mismo para todos los elementos que contiene, y cuando un
elemento se agrega a un combo se le cambia el tracking del elemento poniendo el del combo.
Si el elemento agregado era un combo, este debe cambiar también el tracking de todos sus
elementos para adecuarse al nuevo valor*/



    public void addEnvio(Envio e){
        if(envios.isEmpty()){
            envios.add(e);
            this.setDestinatario(e.getDestinatario());
            this.setRemitente(e.getRemitente());
            this.setDirRemitente(e.getDirRemitente());
            this.setDestino(e.getDestino());
            e.setNroTracking(this.getNroTracking());
        }
        if(destino.equalsIgnoreCase(e.getDestino())){
        e.setNroTracking(this.getNroTracking());
        envios.add(e);
        }
    }



    @Override
    public void setNroTracking(int nroTracking) {
        for (Envio envio : envios){
            envio.setNroTracking(nroTracking);
        }
    }


    public double getPeso(){
        double total = 0;
        for (Envio e: envios) {
            total+= e.getPeso();
        }
        return total;
    }



}
