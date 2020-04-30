package com.idesi.fut;

import java.util.Scanner;

public class Futbolista extends Jugador {

    private int goles;
    private int tarjetasR;
    private int tarjetasA;

    public Futbolista(String nombre, int edad, String equipo) {
        super(nombre, edad, equipo);
    }

    public void setFutbolista(int goles, int tarjetasA, int tarjetasR) {
        this.goles = goles;
        this.tarjetasA = tarjetasA;
        this.tarjetasR = tarjetasR;
    }

    public int getGoles() {
        return goles;
    }

    public int getTarjetasR() {
        return tarjetasR;
    }

    public int getTarjetasA() {
        return tarjetasA;
    }

    public void muestra_informacion() {

        System.out.println("-----Ficha Tecnica------");
        System.out.println("Nombre:" + nombre + "\nEdad:" + edad + "\nEquipo:" + equipo);
        System.out.println("Goles:" + goles + "\nTarjetas Amarrillas:" + tarjetasA + "\nTarjetas Rojas:" + tarjetasR);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre;
        String equipo;
        int edad;
        int goles;
        int tarjetasA;
        int tarjetasR;
        System.out.println("---Jugador---");
        System.out.println("¿Cual es tu nombre?");
        nombre = in.nextLine();
        System.out.println("¿Cual es tu equipo?");
        equipo = in.nextLine();
        System.out.println("¿Cual es tu edad?");
        edad = in.nextInt();
        Jugador objJugador = new Jugador(nombre, edad, equipo);
        System.out.println(objJugador.getNombre() + " Jugador del " + objJugador.getEquipo() + " de " + objJugador.getEdad() + " años");
        
        System.out.println("\n---Futbolista---");
        System.out.println("¿Cual es tu nombre?");
        in.nextLine();
        nombre = in.nextLine();
        System.out.println("¿Cual es tu equipo?");
        equipo = in.nextLine();
        System.out.println("¿Cual es tu edad?");
        edad = in.nextInt();
        System.out.println("¿Cual es tu marca de goles?");
        goles = in.nextInt();
        System.out.println("¿Cual es tu marca de tarjetas amarillas?");
        tarjetasA = in.nextInt();
        System.out.println("¿Cual es tu marca de tarjetas rojas?");
        tarjetasR = in.nextInt();

        Futbolista objFutbolista = new Futbolista(nombre, edad, equipo);
        objFutbolista.setFutbolista(goles, tarjetasA, tarjetasR);
        objFutbolista.muestra_informacion();

    }
}
