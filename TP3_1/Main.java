package TP3_1;

public class Main {
    public static void main(String[] args) {
        Pregunta p1 = new Pregunta("Cual es tu nombre?");
        Pregunta p2 = new Pregunta("Cual es tu edad?");
        Pregunta p3 = new Pregunta("Cual es tu estatura?");
        Persona per1 = new Persona("Fran",12323431);
        Persona per2 = new Persona("Agus",12323432);
        Persona per3 = new Persona("Fran",12323431);

        Empleado emp1 = new Empleado("Emp Juan",234343);
        Empleado emp2 = new Empleado("Emp Juanito",234343);

        Encuesta enc1 = new Encuesta(per1,emp1);
        Encuesta enc2 = new Encuesta(per2,emp1);
        Encuesta enc3 = new Encuesta(per2,emp2);
        Encuesta enc5 = new Encuesta(per3,emp2);


        Empresa empresa = new Empresa("Empresa");
        empresa.agregarEncuesta(enc1);

        empresa.agregarEncuesta(enc2);
        empresa.agregarEncuesta(enc3);

        int cantEncRealizadas = emp1.getCantEncRealizadas();
        System.out.println(cantEncRealizadas);// devuelve 2
    }
    }

