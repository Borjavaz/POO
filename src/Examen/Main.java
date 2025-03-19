package Examen;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Renault","Scenic",200);
        System.out.println("Estas son las caracteristicas del coche1:");
        coche1.mostrar();

        System.out.println(" ");

        Coche coche2 = new Coche("Citroen","C2",150);
        System.out.println("Estas son las caracteristicas del coche2:");
        coche2.mostrar();

        System.out.println(" ");

        coche1.frenar(30);
        coche2.acelerar(30);

        System.out.println("Estos son los resultados despues de la carrera");
        System.out.println("Km/h del coche1: " + coche1.getVelocidad());
        System.out.println("Km/h del coche2: " + coche2.getVelocidad());



    }
}
