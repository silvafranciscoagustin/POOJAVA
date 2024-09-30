package tp7_1;

public class BuscarPorCultivoYEnfermedad extends Buscar{
    private Cultivo cultivo;
    private Enfermedad enfermedad;

    public BuscarPorCultivoYEnfermedad (Cultivo cc, Enfermedad ee){
        this.cultivo = cc;
        this.enfermedad = ee;
    }

    @Override
    public boolean cumple(ProductoQuimico p) {
        if(p.getCultivosQueDesaconseja().contains(cultivo) && p.getEstadosPatologicosQueTrata().containsAll(enfermedad.getEstadosPatologicosDeLaEnfermedad())){
            return true;
        }else{return false;}
    }
}
