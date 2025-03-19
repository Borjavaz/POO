package Empresa;

public class EmpleadoPorHoras extends Empleado {

    private double tarifaPorHora;
    private int horasTrabajadss;

    public EmpleadoPorHoras(String nombre,double salario) {
        super(nombre,salario);
    }

    @Override
    void calcularSalario() {
        double salarioAnual = tarifaPorHora * horasTrabajadss;
        System.out.println("Salario anual: " + salarioAnual);
    }

}
