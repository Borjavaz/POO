package Asociacion;

import java.util.Date;

public class Asalariado extends Trabajador{

    private double salario;
    private String cargo;
    private double porcentajeSeguridadSocial;
    private double porcentajeIRPF;

    public Asalariado(String dni, String nombre, Date dataIngreso, double salario, String cargo, double porcentajeSeguridadSocial, double porcentajeIRPF) {
        super(dni, nombre, dataIngreso);
        this.salario = salario;
        this.cargo = cargo;
        this.porcentajeSeguridadSocial = porcentajeSeguridadSocial;
        this.porcentajeIRPF = porcentajeIRPF;
    }

    @Override
    public String aCadena(){
        return  "DNI: " + super.dni + ", Nome: " + super.nombre + ", Data Ingreso: " + super.dataIngreso + ", Salario: " + salario + ", Cargo: " + cargo + ", Porcentaje Seguridad Social: " + porcentajeSeguridadSocial + ", Porcentaje IRPF: " + porcentajeIRPF;
    }

    @Override
    public double gastosIngresos() {
        return salario + (salario * porcentajeSeguridadSocial / 100) + (salario * porcentajeIRPF / 100);
    }
}
