package TP2_3;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private int habitantes;
    private double mantenimiento;
    ArrayList<Impuesto> impuestos = new ArrayList<>();

    public Ciudad (String nombre,int habitantes,double mantenimiento){
        setNombre(nombre);
        setHabitantes(habitantes);
        setMantenimiento(mantenimiento);
        setImpuestos(impuestos);
    }

    public double recaudo(){
        double recaudo = 0.0;
        for (int i = 0; i < impuestos.size(); i++) {
            recaudo += impuestos.get(i).getRecaudado();
        }
        return recaudo;
    }

    public boolean gastaDeMas(){
        return  recaudo() < mantenimiento;
    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public double getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(double mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public ArrayList<Impuesto> getImpuestos() {
            return impuestos;
    }

    public void setImpuestos(ArrayList<Impuesto> impuestos) {
        this.impuestos = impuestos;
    }





    public static void main(String[] args) {
        Provincia p1 = new Provincia("Buenos Aires");
        Ciudad c1 = new Ciudad("Bariloo",100000,12700);
        Impuesto imp1 = new Impuesto("imp1", 12500);
        c1.getImpuestos().add(imp1);

        //lo hice asi porque no use el toString.
        System.out.println(c1.getImpuestos().get(0).getNombreImp());
        System.out.println(c1.recaudo());
    }
}
