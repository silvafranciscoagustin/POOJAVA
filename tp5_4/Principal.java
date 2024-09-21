package tp5_4;

public class Principal {
    public static void main(String[] args) {
        Alumno Alumno1 = new Alumno("Juancito");

        Alumno1.addCualidad("Proactivo");
        Alumno1.addCualidad("Bueno");

        Casa casa1 = new Casa(10);
        casa1.addCualidad("Proactivo");
        casa1.addCualidad("Bueno");

        casa1.agregarAlumno(Alumno1);


        CasaFamiliar casaExigente1 = new CasaFamiliar(20);
        casaExigente1.alumnos.add(Alumno1);
        casaExigente1.addCualidad("Capo");
        casaExigente1.addCualidad("Idolo");
        Alumno Alumno2 = new Alumno("Facundo");
        Alumno2.addCualidad("Capo");
        Alumno2.addCualidad("Idolo");

        Alumno2.setFamiliar(Alumno1);

        casaExigente1.agregarAlumno(Alumno2);

        Alumno Alumno3 = new Alumno("Pepito");
        Alumno Alumno4 = new Alumno("Carlos");

        Alumno3.addCualidad("Capo");
        Alumno3.addCualidad("Idolo");
        Alumno3.setFamiliar(Alumno2);
        casaExigente1.agregarAlumno(Alumno3);
        casaExigente1.agregarAlumno(Alumno3);


        CasaEnemistada casaRiver= new CasaEnemistada(10);
        CasaEnemistada casaBoca= new CasaEnemistada(10);
        casaRiver.agregarCasaEnemiga(casaBoca);
        casaBoca.agregarCasaEnemiga(casaRiver);
        Alumno Alumno5 = new Alumno("Miguel");
        casaRiver.agregarAlumno(Alumno5);
        casaBoca.agregarAlumno(Alumno5);
}
}
