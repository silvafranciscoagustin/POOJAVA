package tp7_1;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosQueDesaconseja;
    private ArrayList<String> estadosPatologicosQueTrata;

    public ProductoQuimico(String nombre){
        setNombre(nombre);
        cultivosQueDesaconseja = new ArrayList<>();
        estadosPatologicosQueTrata = new ArrayList<>();
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void addCultivoQueDesaconseja(Cultivo c){
        this.cultivosQueDesaconseja.add(c);
    }

    public void setCultivosQueDesaconseja(ArrayList<Cultivo> cultivosQueDesaconseja) {
        this.cultivosQueDesaconseja = new ArrayList<>(cultivosQueDesaconseja);
    }

    public void setEstadosPatologicosQueTrata(ArrayList<String> estadosPatologicosQueTrata) {
        this.estadosPatologicosQueTrata = new ArrayList<>(estadosPatologicosQueTrata);
    }

    public void addEstadoPatologicoQueTrata(String epatolog){
        this.estadosPatologicosQueTrata.add(epatolog);
    }

    public ArrayList<Cultivo> getCultivosQueDesaconseja(){
        return new ArrayList<>(cultivosQueDesaconseja);
    }

    public ArrayList<String> getEstadosPatologicosQueTrata(){
        return new ArrayList<>(estadosPatologicosQueTrata);
    }






}
