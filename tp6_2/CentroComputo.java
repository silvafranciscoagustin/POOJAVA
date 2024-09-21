package tp6_2;

public class CentroComputo {
    private ColaEspera colaComputadoras;
    private ColaEspera colaProcesos;


    public CentroComputo(){
        colaComputadoras = new ColaEspera();
        colaProcesos = new ColaEspera();
    }

    public void agregarComputadora(Computadora cc){
        if(!colaComputadoras.getElementos().contains(cc) && cc != null){
            colaComputadoras.agregarElemento(cc);
        }
    }
    public void agregarProceso(Proceso pp){
        if(colaComputadoras.tieneElementos() && pp != null){
            Computadora libre = (Computadora) colaComputadoras.getSiguiente();
            libre.ejecutarProceso(pp);
        }
        else{
            colaProcesos.agregarElemento(pp);
        }
    }

}
