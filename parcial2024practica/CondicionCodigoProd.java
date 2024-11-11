package parcial2024practica;

public class CondicionCodigoProd extends Condicion {
    private String codigo;

    public CondicionCodigoProd(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public boolean cumple(Vendedor vv) {
        return vv.vendiste(codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



}
