package Animales;

public class Main {

    public static void main(String[] args) {
        Canguro nai = new Canguro("Mai", 14);
        System.out.println(nai.parir() + " chamado: " + nai.getNombre());
        nai.ronroneo();
        nai.desplazar();
        nai.voz();


        System.out.println(" ");


        Can rex = new Can("Rex", 10);
        System.out.println(rex.parir() + " chamado: " + rex.getNombre());
        rex.ronroneo();
        rex.desplazar();
        rex.voz();

    }
}
