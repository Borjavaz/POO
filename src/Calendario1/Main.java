package Calendario1;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);

        Calendario c = new Calendario(31, 12, 2023);
        System.out.println("Esta es la fecha inicial");
        System.out.println(c.getDia() + "/" + c.getMes() + "/" + c.getAño()); // 31/12/2023
        System.out.println("Sumandole un dia");
        c.incrementarDia();
        System.out.println(c.getDia() + "/" + c.getMes() + "/" + c.getAño()); // 1/1/2024
        System.out.println(" ");
        System.out.println("Esto es un ejemplo con un año bisiesto");
        c.setDia(28);
        c.setMes(2);
        c.setAño(2024);
        c.incrementarDia();
        System.out.println("Esta es la fecha");
        System.out.println(c.getDia() + "/" + c.getMes() + "/" + c.getAño()); // 29/2/2024 (bisiesto)
        System.out.println("Sumandole un dia");
        c.incrementarDia();
        System.out.println(c.getDia() + "/" + c.getMes() + "/" + c.getAño()); // 1/3/2024

        System.out.println(" ");
        System.out.println("Ingresa una fecha para compararla");
        System.out.println("Introduce el día:");
        int dia = scanner.nextInt();
        System.out.println("Introduce el mes:");
        int mes = scanner.nextInt();
        System.out.println("Introduce el año:");
        int año = scanner.nextInt();

        Calendario outraData = new Calendario(dia, mes, año);

        if (c.dataIgual(outraData)) {
            System.out.println("Las fechas son iguales");
        } else {
            System.out.println("Las fechas no son iguales");
        }
    }
}
