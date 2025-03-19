package Empresa;

public abstract class Empleado {

    private String nombre;
    private double salario;

    ///Constructores con parametros
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Getters y Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}

    abstract void calcularSalario();
}

