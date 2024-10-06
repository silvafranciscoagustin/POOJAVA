package tp7_4.condiciones;

import tp7_4.Condicion;
import tp7_4.Ficha;

public class CondionFortalezaMayorA extends Condicion {
    private int fortalezaMayorA;

    public CondionFortalezaMayorA(int fortalezaMayorA) {
        this.fortalezaMayorA = fortalezaMayorA;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getGolpesNecesariosParaDestruirla()>fortalezaMayorA;
    }
}
