package Abstraccion;

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear un televisor
        Televisor miTV = new Televisor("Samsung", 150);
        miTV.mostrarInfo();
        miTV.encender();
        miTV.cambiarCanal(5);
        miTV.apagar();

        System.out.println("-----------------");

        // Crear una lavadora
        Lavadora miLavadora = new Lavadora("LG", 500);
        miLavadora.mostrarInfo();
        miLavadora.encender();
        miLavadora.iniciarLavado();
        miLavadora.apagar();
    }
}
