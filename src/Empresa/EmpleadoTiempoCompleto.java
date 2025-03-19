package Empresa;

public class EmpleadoTiempoCompleto extends Empleado{

    private double bonoAnual;

    public EmpleadoTiempoCompleto(String nombre, int salario) {
        super(nombre, salario);
    }

    @Override
    void calcularSalario() {
        double salarioAnual = getSalario() * 12 + bonoAnual;
        System.out.println("Salario anual: " + salarioAnual);
    }
}
