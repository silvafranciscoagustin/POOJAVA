package parcial2024practica;

public class CondicionAnd extends Condicion{
    Condicion c1;
    Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Vendedor otro){
        return c1.cumple(otro) && c2.cumple(otro);
    }


    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    public Condicion getC2() {
        return c2;
    }

    public void setC2(Condicion c2) {
        this.c2 = c2;
    }
}
