package Boletin10_1;

public class Main {
    public static void main(String[] args) {
        Garaxe g = new Garaxe("Rua Nova", 12, "Santiago", 15000, 2.5, 5.0, 1, true);
        LocalComercial l = new LocalComercial("Avda. Galicia", 20, "Lugo", 50000, 1, 0, 100, true, true, false, "Boa ubicación");
        Vivenda v = new Vivenda("Rua Real", 8, "A Coruña", 120000, 2, 3, 4, true, false, true, "Vistas ao mar");

        System.out.println(g.mostrarDetalles());
        System.out.println("Ganancia en venda: " + g.calcularGanancia(true) + "€");
        System.out.println("Ganancia en aluguer: " + g.calcularGanancia(false) + "€");

        System.out.println(l.mostrarDetalles());
        System.out.println("Ganancia en venda: " + l.calcularGanancia(true) + "€");
        System.out.println("Ganancia en aluguer: " + l.calcularGanancia(false) + "€");

        System.out.println(v.mostrarDetalles());
        System.out.println("Ganancia en venda: " + v.calcularGanancia(true) + "€");
        System.out.println("Ganancia en aluguer: " + v.calcularGanancia(false) + "€");
    }
}
