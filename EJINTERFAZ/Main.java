package EJINTERFAZ;

import java.rmi.dgc.VMID;

public class Main {
    public static void main(String[] args) {
        HorrorSHOW horrorShow = new HorrorSHOW();
        MonstruoPeligroso barney = new Godzilla();
        Godzilla barney2 = new Godzilla();

        //´´´´Vampiro vampito = new VampiroMalefico();

        horrorShow.asusta(barney);
       // horrorShow.liquida(barney); liquda es de vampiro pq es letal, monstruo peligroso no es }
        horrorShow.liquida(vampito);

    }

}
