package Asociacion;

import java.util.Date;

public abstract class Trabajador2 extends Asociacion {

    public String dni;
    public String nombre;
    public Date dataIngreso;

    public Trabajador2 (String dni, String nombre, Date dataIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.dataIngreso = dataIngreso;
    }

    public abstract double gastosIngresos();
    public abstract String aCadena();
}