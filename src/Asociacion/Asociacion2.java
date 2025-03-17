package Asociacion;

import java.util.ArrayList;
import java.util.List;

public abstract class Asociacion2 {
    private List<Socio> socios;
    private List<Trabajador> trabajadores;

    public Asociacion2() {
        socios = new ArrayList<>();
        trabajadores = new ArrayList<>();
    }

    public void engadirSocio(Socio socio) {
        socios.add(socio);
    }

    public void engadirTraballador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

    public double calcularBalance() {
        double balance = 0.0;

        for (Socio socio : socios) {
            balance += socio.gastosIngresos();
        }
        for (Trabajador trabajador : trabajadores) {
            balance -= trabajador.gastosIngresos();
        }

        return balance;
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public List<Trabajador> getTraballadores() {
        return trabajadores;
    }

    public abstract double gastosIngresos();
}
