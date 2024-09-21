package tp6_3;

public class Puerto {
    private ColaEsperaBarco colaEsperaBarco;
    private ColaEsperaCamion colaEsperaCamion;

    public Puerto(ColaEsperaCamion colaEsperaCamion, ColaEsperaBarco colaEsperaBarco){
        setColaEsperaBarco(colaEsperaBarco);
        setColaEsperaCamion(colaEsperaCamion);
    }

    public void cargarCereal(){
        while(colaEsperaBarco.hayElementos() && colaEsperaCamion.hayElementos()){
            ((Barco)colaEsperaBarco.getPrimero()).cargar();
            ((Camion)colaEsperaCamion.getPrimero()).descargar();
            this.colaEsperaBarco.borrarPrimero();
            this.colaEsperaCamion.borrarPrimero();
        }



    }

    public ColaEsperaBarco getColaEsperaBarco() {
        return colaEsperaBarco;
    }

    public void setColaEsperaBarco(ColaEsperaBarco colaEsperaBarco) {
        this.colaEsperaBarco = colaEsperaBarco;
    }

    public ColaEsperaCamion getColaEsperaCamion() {
        return colaEsperaCamion;
    }

    public void setColaEsperaCamion(ColaEsperaCamion colaEsperaCamion) {
        this.colaEsperaCamion = colaEsperaCamion;
    }
}
