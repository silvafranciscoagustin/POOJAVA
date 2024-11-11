package parcial2024practica;

public class CondicionNot extends Condicion{
    private Condicion c1;

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Vendedor vv) {
        return !c1.cumple(vv);
    }
}
