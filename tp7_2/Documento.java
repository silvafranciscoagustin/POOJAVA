package tp7_2;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private String contenidoTextual;
    private ArrayList<String> autores;
    private ArrayList<String> palabrasClaves;

    public Documento(String titulo, String contenidoTextual){
        setTitulo(titulo);
        setContenidoTextual(contenidoTextual);
        this.autores = new ArrayList<>();
        this.palabrasClaves = new ArrayList<>();
    }



    public void addAutor(String autor){
        this.autores.add(autor);
    }
    public void addPalabraClave(String palabraClave){
        this.autores.add(palabraClave);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = new ArrayList<>(autores);
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public void setContenidoTextual(String contenidoTextual) {
        this.contenidoTextual = contenidoTextual;
    }

    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(palabrasClaves);
    }

    public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
        this.palabrasClaves = new ArrayList<>(palabrasClaves);
    }


    @Override
    public String toString() {
        return "Titulo" + getTitulo()+ "\n"+
                "...etc";
    }
}
