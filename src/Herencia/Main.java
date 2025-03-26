package Herencia;

public class Main {
    public static void main(String[] args) {
        // Crear un perro
        Perro miPerro = new Perro("Rex", 3);
        miPerro.mostrarInfo();
        miPerro.hacerSonido();
        miPerro.buscarPelota(); // Metodo propio de Perro

        System.out.println("-----------------");

        // Crear un gato
        Gato miGato = new Gato("Whiskers", 2);
        miGato.mostrarInfo();
        miGato.hacerSonido();
        miGato.ronronear(); // Metodo propio de Gato
    }
}
