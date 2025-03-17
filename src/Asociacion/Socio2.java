package Asociacion;

import java.util.Date;

    public class Socio2 extends Asociacion {
        private String dni;
        private String nombre;
        private String direccion;
        private String provincia;
        private Date dataAlta;
        private double cuota;

        public Socio2(String dni, String nombre, String direccion, String provincia, Date dataAlta, double cuota) {
            this.dni = dni;
            this.nombre = nombre;
            this.direccion = direccion;
            this.provincia = provincia;
            this.dataAlta = dataAlta;
            this.cuota = cuota;
        }

        public String aCadena(){
            return "DNI: " + dni + ", Nome: " + nombre + ", Direccion: " + direccion + ", Provincia: " + provincia + ", Data Alta: " + dataAlta + ", Cuota: " + cuota;
        }
        public double gastosIngresos(){
            return cuota;
        }
    }

