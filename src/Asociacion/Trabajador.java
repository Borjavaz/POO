package Asociacion;

import javax.xml.crypto.Data;
import java.util.Date;

public abstract class Trabajador extends Asociacion {

    public String dni;
    public String nombre;
    public Date dataIngreso;

    public Trabajador(String dni, String nombre, Date dataIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.dataIngreso = dataIngreso;
    }

    public abstract double gastosIngresos();
    public abstract String aCadena();
}
