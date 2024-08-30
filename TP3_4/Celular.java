package TP3_4;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Celular {
    private String modelo;
    private ArrayList<Contacto> contactos = new ArrayList<>();

    public Celular(String modelo){
        setModelo(modelo);
        this.contactos = new ArrayList<>();
    }

    public void mostrarContactos(){
            for(Contacto cc : contactos){
                System.out.println("Apellido: "+ cc.getApellido()+
                                    "Nombre: "+ cc.getNombre()+
                                    "Edad: "+ calcularEdad(cc)+
                                    "Nro Tel: "+ cc.getNroTel()+
                                    "Ciudad: "+ cc.getCiudad());
            }
    }

    public void promedioEdad(){

         int edad = 0;
        for(Contacto cc : contactos){
            edad += calcularEdad(cc);
        }
        System.out.println("Promedio de edad: "+ edad/contactos.size());
       /** Set<String> datosUnicos = new HashSet<>();
        for (Contacto cc : contactos) {
            String datosContacto = cc.getNombre() + " " + cc.getApellido() + " " + cc.getNroTel();
            if (!datosUnicos.add(datosContacto)) {
                System.out.println("Contacto duplicado: " + datosContacto);
            }
        }**/
    }
    public ArrayList<Contacto> mostrarRepetidos(){
        //creo array list vacio para almacenar los repetidos
        ArrayList<Contacto> contactosRepetidos = new ArrayList<>();
        //for que recorre el array de todos los contactos
        for(Contacto contacto : contactos){
            int j = 1;
            //for que recorre los contactos, para el primer contacto, y los compara con todos!
            for (int i = j; i <contactos.size() ; i++) {
                //si el primer contacto del segundo for, es igual al primer contacto de el primer for
                //y no esta en el arreglo de repetidos, lo metemos,asi sucesivamente
                if(contactos.get(i).equals(contacto)&&!contactosRepetidos.contains(contacto)){
                    contactosRepetidos.add(contacto);
                }
            }
        }
        return contactosRepetidos;
    }

    public void listarMismoNroTelef(){
        for (Contacto contacto: contactos) {
            for (int i = 0; i < contactos.size(); i++) {
                if(contactos.get(i).getNroTel() == contacto.getNroTel()){
                    System.out.println("Contacto encontrado con mismo nro tel: "+contacto.getNombre()+" "+
                            contacto.getApellido()+" "+contacto.getNroTel());
                }
            }
        }
    }



    public int calcularEdad(Contacto cc){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(cc.getFechaNac(), hoy);
        return periodo.getYears();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }
}
