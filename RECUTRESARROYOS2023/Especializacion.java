package RECUTRESARROYOS2023;

import RECUTRESARROYOS2023.condicion.Condicion;

import java.util.ArrayList;

public class Especializacion extends ElementoEducativo{

    protected ArrayList<ElementoEducativo> elementos;
    private double porcentajePorCurso;
    private static double topeDescuento = 0.5;

    public Especializacion(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();

    }

    public static double getTopeDescuento() {
        return topeDescuento;
    }

    public static void setTopeDescuento(double topeDescuento) {
        Especializacion.topeDescuento = topeDescuento;
    }

    public void setElementos(ArrayList<ElementoEducativo> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (ElementoEducativo e : elementos){
            total+=e.getPrecio();
        }

        double descuento = total * ( porcentajePorCurso * cantCursos());
        double descuentoMaximo = total - (total*topeDescuento);

        if(descuento > descuentoMaximo){
           return total-descuento;
        }else{
            return total - descuentoMaximo;
        }
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> palabrasSinRepetir = new ArrayList<>();
        for (ElementoEducativo e : elementos){
            ArrayList<String> temp = e.getPalabrasClave();
            for (String palabra : temp){
                if(!palabrasSinRepetir.contains(palabra)){
                    palabrasSinRepetir.add(palabra);
                }
            }
        }
        return palabrasSinRepetir;
    }

    @Override
    public ArrayList<String> getDocentesAcargo() {
        ArrayList<String> docentesSinRepetir = new ArrayList<>();
        for (ElementoEducativo e : elementos){
            ArrayList<String> temp = e.getDocentesAcargo();
            for (String docente : temp){
                if(!docentesSinRepetir.contains(docente)){
                    docentesSinRepetir.add(docente);
                }
            }
        }
        return docentesSinRepetir;
    }

    @Override
    public int cantCursos() {
        int total = 0;
        for (ElementoEducativo e: elementos){
            total+= e.cantCursos();
        }
        return total;
    }


    @Override
    public int getHorasCatedra() {
        int total = 0;
        for (ElementoEducativo e: elementos){
            total+= e.getHorasCatedra();
        }
        return total;
    }

    @Override
    public ArrayList<Curso> buscar(Condicion c) {
        ArrayList<Curso> retorno = new ArrayList<>();
        for (ElementoEducativo e: elementos){
            ArrayList<Curso> cursosQueCumplen = e.buscar(c);
            retorno.addAll(cursosQueCumplen);
        }
        return retorno;
    }
    public Curso cursoMasCaro(){
        double masCaro = 0;
        Curso cursoMasCaro = null;

        for (ElementoEducativo e: elementos){
            Curso cursoMasCaroDelHijo =  e.cursoMasCaro();
            double valorCursoMasCaroHijo = cursoMasCaroDelHijo.getPrecio();
            if(valorCursoMasCaroHijo> masCaro){
                masCaro = valorCursoMasCaroHijo;
                cursoMasCaro = cursoMasCaroDelHijo;
            }
        }

        return cursoMasCaro;
    }


    public void addEspecializacion(ElementoEducativo e, Condicion c){
        if(c.cumple(e)){
            elementos.add(e);
        }
    }


    public double getPorcentajePorCurso() {
        return porcentajePorCurso;
    }

    public void setPorcentajePorCurso(double porcentajePorCurso) {
        this.porcentajePorCurso = porcentajePorCurso;
    }

}
