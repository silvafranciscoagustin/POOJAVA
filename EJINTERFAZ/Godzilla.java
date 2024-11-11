package EJINTERFAZ;

public class Godzilla implements MonstruoPeligroso{

    @Override
    public void asustar() {
        System.out.println("GRRRRR");
    }

    @Override
    public void destruir() {
        System.out.println("PLOFFF");

    }

    @Override
    public void gritar() {
        System.out.println("AAAAAA");

    }
}
