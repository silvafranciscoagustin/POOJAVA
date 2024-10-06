package tp7_4;

public class Ficha {
    private int golpesNecesariosParaDestruirla;
    private int cantCasilleros;
    private int poderDestruccion;

    public Ficha(int golpesNecesariosParaDestruirla, int cantCasilleros, int poderDestruccion){
        setGolpesNecesariosParaDestruirla(golpesNecesariosParaDestruirla);
        setCantCasilleros(cantCasilleros);
        setPoderDestruccion(poderDestruccion);
    }





    public int getGolpesNecesariosParaDestruirla() {
        return golpesNecesariosParaDestruirla;
    }

    public void setGolpesNecesariosParaDestruirla(int golpesNecesariosParaDestruirla) {
        this.golpesNecesariosParaDestruirla = golpesNecesariosParaDestruirla;
    }

    public int getCantCasilleros() {
        return cantCasilleros;
    }

    public void setCantCasilleros(int cantCasilleros) {
        this.cantCasilleros = cantCasilleros;
    }

    public int getPoderDestruccion() {
        return poderDestruccion;
    }

    public void setPoderDestruccion(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }
}
