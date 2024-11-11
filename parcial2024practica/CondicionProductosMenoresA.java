package parcial2024practica;

public class CondicionProductosMenoresA extends Condicion{
    public int productosMenoresA;

    @Override
    public boolean cumple(Vendedor vv) {
        return vv.getCantTotalProdVend()<productosMenoresA;
    }

    public int getProductosMenoresA() {
        return productosMenoresA;
    }

    public void setProductosMenoresA(int productosMenoresA) {
        this.productosMenoresA = productosMenoresA;
    }

    public CondicionProductosMenoresA(int productosMenoresA) {
        this.productosMenoresA = productosMenoresA;
    }
}
