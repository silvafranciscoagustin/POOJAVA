package tp6_1_nuevo;

public class Pelicula extends Item {
    private String infoFilm;

    public Pelicula(int cantCopias, String infoFilm) {
        super(cantCopias);
        this.infoFilm = infoFilm;
    }

    @Override
    public void setCantCopias(int cc){
        if(cc >= 0){
            this.cantCopias = cc;
        }
    }

    public String getInfoFilm() {
        return infoFilm;
    }

    public void setInfoFilm(String infoFilm) {
        this.infoFilm = infoFilm;
    }
}
