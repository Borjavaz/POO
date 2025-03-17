package Boletin9_3;

public class Main {
    public static void main(String[] args) {
        //Coche 1
        Coche coche = new Coche(50);
        System.out.println("El coche 1 va a "  + coche.getVelocidad() + " km/h");

        //Coche 2
        Coche coche2 = new Coche(50);
        coche2.acelerar(30);
        System.out.println("El coche 2 va a "  + coche2.getVelocidad() + " km/h");

        //Coche 3
        Coche coche3 = new Coche(50);
        coche3.frenar(30);
        System.out.println("El coche 3 va a "  + coche3.getVelocidad() + " km/h");


    }
}
