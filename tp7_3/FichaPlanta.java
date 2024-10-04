package tp7_3;

import java.util.ArrayList;

public class FichaPlanta {
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasifSuperior;
    private String familia;
    private String clase;
    private String interiorOExterior;
    private int requerimientoDeSol;
    private int requerimientoDeAgua;

    public FichaPlanta(String nombreCientifico, String clasifSuperior, String familia, String clase, String interiorOExterior, int requerimientoDeSol, int requerimientoDeAgua) {
        this.nombreCientifico = nombreCientifico;
        this.nombresVulgares = new ArrayList<>();
        this.clasifSuperior = clasifSuperior;
        this.familia = familia;
        this.clase = clase;
        this.interiorOExterior = interiorOExterior;
        this.requerimientoDeSol = requerimientoDeSol;
        this.requerimientoDeAgua = requerimientoDeAgua;
    }



    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void addNombreVulgar(String nombreVulgar){
        this.nombresVulgares.add(nombreVulgar);
    }
    public ArrayList<String> getNombresVulgares() {
        return new ArrayList<>(nombresVulgares);
    }

    public void setNombresVulgares(ArrayList<String> nombresVulgares) {
        this.nombresVulgares = new ArrayList<>(nombresVulgares);
    }

    public String getClasifSuperior() {
        return clasifSuperior;
    }

    public void setClasifSuperior(String clasifSuperior) {
        this.clasifSuperior = clasifSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getInteriorOExterior() {
        return interiorOExterior;
    }

    public void setInteriorOExterior(String interiorOExterior) {
        this.interiorOExterior = interiorOExterior;
    }

    public int getRequerimientoDeSol() {
        return requerimientoDeSol;
    }

    public void setRequerimientoDeSol(int requerimientoDeSol) {
        this.requerimientoDeSol = requerimientoDeSol;
    }

    public int getRequerimientoDeAgua() {
        return requerimientoDeAgua;
    }

    public void setRequerimientoDeAgua(int requerimientoDeAgua) {
        this.requerimientoDeAgua = requerimientoDeAgua;
    }
}
