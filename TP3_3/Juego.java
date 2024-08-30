package TP3_3;

import java.util.ArrayList;

public class Juego {
    private String nombreJuego;
    private ArrayList<Personaje> personajes = new ArrayList<>();


    public Juego (String nombreJuego){
        setNombreJuego(nombreJuego);
        this.personajes =new ArrayList<>(4);
    }

    public void pelear(Personaje p1, Personaje p2){
        if(p1.getFuerza() > p2.getFuerza()) {
            System.out.println(p1.getNombreSuper()+ " Wins!");
        } else if (p1.getFuerza() < p2.getFuerza()) {
            System.out.println(p2.getNombreSuper()+ " Wins!");
            //caso que empaten se define por otra caractaristica
        }else{

            if(p1.getVelocidad() > p2.getVelocidad()) {
                System.out.println(p1.getNombreSuper()+ " Wins!");
            } else if (p1.getVelocidad() < p2.getVelocidad()) {
                System.out.println(p2.getNombreSuper()+ " Wins!");
            }else{
                System.out.println("EPIC DRAW!");
            }
        }
    }

    public static void main(String[] args) {
        Personaje p1 = new Personaje("Pelaa","Baraka","Cuchillas en las manos",25,85,33);
        Personaje p2 = new Personaje("Calaa","Scorpion","Manipulacion de Fuego",25,86,33);
        Personaje p3 = new Personaje("Icee","Sub Zero","Manipulacion de Hielo",26,86,33);

        Juego j1 = new Juego("Mortal Kombat");

        j1.pelear(p1,p2);


    }




    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }
}
