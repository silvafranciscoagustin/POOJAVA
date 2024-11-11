package parcial2024practica;

public class CondicionGananciasMenor extends Condicion {
    private int gananciaMenorA;

    public CondicionGananciasMenor(int gananciaMenorA) {
        this.gananciaMenorA = gananciaMenorA;
    }

    public int getGananciaMenorA() {
        return gananciaMenorA;
    }

    public void setGananciaMenorA(int gananciaMenorA) {
        this.gananciaMenorA = gananciaMenorA;
    }

    @Override
    public boolean cumple(Vendedor otro){
       return otro.getGanancias()<gananciaMenorA;
    }

}
