package tp7_1;

import java.util.ArrayList;

public class Sistema {
    private String nombreSistema;
    private ArrayList<ProductoQuimico> productosQuimicos;
    private ArrayList<Cultivo> cultivos;
    private ArrayList<Enfermedad> enfermedades;




    public ArrayList<ProductoQuimico>buscar (Buscar b){
        ArrayList<ProductoQuimico> productoQuimicosRecomendados = new ArrayList<>();
        for(ProductoQuimico p : productosQuimicos){
            if(b.cumple(p)){
                productoQuimicosRecomendados.add(p);
            }
        }
        return productoQuimicosRecomendados;
    }






    /*public ArrayList<ProductoQuimico> productoQuimicosQueTratanEnfermedad(Enfermedad e){
        ArrayList<ProductoQuimico> retorno = new ArrayList<>();
        for (ProductoQuimico pquim: productosQuimicos) {
            if(pquim.getEstadosPatologicosQueTrata().contains(e.getEstadosPatologicosDeLaEnfermedad())){
                retorno.add(pquim);
            }
        }
        return retorno;
    }
// redefinir equals, repito codigo, hay que hacer un filtro mejor
    public ArrayList<ProductoQuimico> productosQueTratanEnfermedadSinDañarCultivo(Enfermedad ee, Cultivo cc){
        ArrayList<ProductoQuimico> retorno = new ArrayList<>();
        for (ProductoQuimico pquim: productosQuimicos) {
        if(pquim.getEstadosPatologicosQueTrata().contains(ee.getEstadosPatologicosDeLaEnfermedad()) && pquim.getCultivosQueDesaconseja().contains(cc) )
                retorno.add(pquim);
        }
        return retorno;
    }*/







    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public ArrayList<ProductoQuimico> getProductosQuimicos() {
        return new ArrayList<>(productosQuimicos);
    }

    public void setProductosQuimicos(ArrayList<ProductoQuimico> productosQuimicos) {
        this.productosQuimicos = new ArrayList<>(productosQuimicos);
    }

    public ArrayList<Cultivo> getCultivos() {
        return new ArrayList<>(cultivos);
    }

    public void setCultivos(ArrayList<Cultivo> cultivos) {
        this.cultivos = new ArrayList<>(cultivos);
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return new ArrayList<>(enfermedades);
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = new ArrayList<>(enfermedades);
    }
}
