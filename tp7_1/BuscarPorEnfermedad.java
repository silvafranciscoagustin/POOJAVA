package tp7_1;

public class BuscarPorEnfermedad extends Buscar {
    private Enfermedad enfermedad;
    public BuscarPorEnfermedad(Enfermedad enfermedad){
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean cumple(ProductoQuimico p) {
        if(p.getEstadosPatologicosQueTrata().containsAll(enfermedad.getEstadosPatologicosDeLaEnfermedad())){
            return true;
        }else {return false;}
    }
}
