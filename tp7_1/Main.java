package tp7_1;


public class Main {
    public static void main(String[] args) {
        ProductoQuimico pq1 = new ProductoQuimico("Select");
        ProductoQuimico pq2 = new ProductoQuimico("Glifosato");

        Cultivo c1 = new Cultivo("Maiz");
        Cultivo c2 = new Cultivo("Alpiste");

        Enfermedad ef1 = new Enfermedad("ef1");
        Enfermedad ef2 = new Enfermedad("ef2");

        pq1.addCultivoQueDesaconseja(c1);
        pq1.addEstadoPatologicoQueTrata("hojas amarillas");

        pq2.addCultivoQueDesaconseja(c2);
        pq2.addEstadoPatologicoQueTrata("caida de frutos");



        c1.addEnfermedad(ef1);
        c2.addEnfermedad(ef2);

        ef1.addEstadoPatologicoDeLaEnfermedad("hojas amarillas");
        ef2.addEstadoPatologicoDeLaEnfermedad("caida de frutos");




    }
}
