package tp7_4;

public class FichaEspecial extends Ficha{

    public FichaEspecial(int golpesNecesariosParaDestruirla, int cantCasilleros, int poderDestruccion) {
        super(golpesNecesariosParaDestruirla, cantCasilleros, poderDestruccion);
    }

    @Override
    public int getPoderDestruccion() {
        return this.getGolpesNecesariosParaDestruirla() / this.getCantCasilleros();
    }
}
