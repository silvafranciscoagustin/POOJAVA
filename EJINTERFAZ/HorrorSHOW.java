package EJINTERFAZ;

public class HorrorSHOW {
    public HorrorSHOW(){}
    public void asusta(Monstruo m){
        m.asustar();
    }
    public void liquida(MonstruoLetal l){
        l.matar();
    }
    public void asustaMas(MonstruoPeligroso m){
        m.asustar();
        m.destruir();
    }
}
