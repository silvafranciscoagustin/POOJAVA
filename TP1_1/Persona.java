package TP1_1;

import java.time.LocalDate;
import java.util.Date;

public class Persona {
    private static final int MAYORIADEEDAD = 18, EDADVOTO = 16;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private int dni;
    private String sexo;
    private Double peso;
    private Double altura;


    public Persona (String nombre,String apellido, int edad, LocalDate fechaNacimiento, int dni, String sexo, Double peso, Double altura){
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setFechaNacimiento(fechaNacimiento);
        this.dni = dni;
        setSexo(sexo);
        setPeso(peso);
        setAltura(altura);
    }
    public Persona (String nombre,String apellido, int edad, LocalDate fechaNacimiento, int dni, String sexo, Double peso ){
        this(nombre,apellido,edad,fechaNacimiento,dni,sexo,peso,1.0);
    }
    public Persona (String nombre,String apellido, int edad, LocalDate fechaNacimiento, int dni, String sexo){
        this(nombre,apellido,edad,fechaNacimiento,dni,sexo,85.0);
    }
    public Persona (String nombre,String apellido, int edad, LocalDate fechaNacimiento, int dni){
        this(nombre,apellido,edad,fechaNacimiento,dni,"Femenino");
    }
    public Persona (String nombre,String apellido,int edad,int dni){
        this(nombre,apellido,edad,LocalDate.of(01,01,2000),dni);
    }
    public Persona (String nombre,String apellido,int dni){
        this(nombre,apellido,20,dni);
    }
    public Persona (String nombre,int dni){
        this(nombre,"N",dni);
    }
    public Persona (int dni){
        this("N","N",20,dni);
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

   // public void setDni(int dni) {
     //   this.dni = dni;
    //}

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("El peso no puede ser negativo");
        }
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("La altura no puede ser negativa");
        }
        this.altura = altura;
    }

    //Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
    //de masa corporal el cual es peso / altura2
    public double calcularImc(){
        peso = getPeso();
        altura = getAltura();
        return peso / (altura*altura);
    }
    //Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
    //entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
    public boolean estaEnForma(){
        double imc = calcularImc();
        return (imc <= 25 && imc >= 18.5);
    }

    public boolean estaCumpliendo(){
        LocalDate hoy = LocalDate.now();
        return fechaNacimiento.getMonth() == hoy.getMonth() && fechaNacimiento.getDayOfMonth() == hoy.getDayOfMonth();
    }
    //Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
    //años
    public int getAnios(){
        return (LocalDate.now().getYear() - fechaNacimiento.getYear());
    }
    public boolean esMayor(){
        int edad = getAnios();
        return edad >= MAYORIADEEDAD && (edad >=MAYORIADEEDAD || estaCumpliendo());
    }

    //Saber si puede votar. Es necesario ser mayor de 16 años.
    public boolean puedeVotar(){
        return getAnios() >= EDADVOTO;
    }

    //Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
    public boolean esCoherenteLaEdad(){
        LocalDate hoy = LocalDate.now();
        return hoy.getYear() - fechaNacimiento.getYear() == getAnios();
    }


    public String toString(){
        return "Persona: "+
                "Nombre: " + getNombre() +"\n" +
                "Apellido: "+ getApellido() +"\n" +
                "Edad: "+ getEdad()+ "\n" +
                "Fecha de Nacimiento: "+ getFechaNacimiento()+ "\n" +
                "DNI: " + getDni()+ "\n" +
                "Sexo: " + getSexo()+ "\n" +
                "Altura: "+ getAltura()+ "\n" +
                "Peso: "+ getPeso()+ "\n";
    }

}






