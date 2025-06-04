package Empresa;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Empleado1");
        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Maco",1500);
        empleado1.calcularSalario();
        System.out.println("  ");
        System.out.println("Empleado2");
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Bor",2000);
        empleado2.calcularSalario();
    }
}


