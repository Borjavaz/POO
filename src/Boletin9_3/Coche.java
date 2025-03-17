package Boletin9_3;

public class Coche {

    private int velocidad; // en km/h

    //Constructor por defecto
    public Coche() {
        velocidad = 0;
    }

    //Constructor con parametros
    public Coche(int velocidad) {
        this.velocidad = velocidad;
    }

    //Get y Set
    public int getVelocidad() {return velocidad;}
    public void setVelocidad(int velocidad) {this.velocidad = velocidad;}

    //Funcion para incrementar la velocidad
    public void acelerar(int valor) {
        velocidad += valor;
    }

    //Funcion para diminuir la velocidad
    public void frenar(int menos) {
        velocidad -= menos;
    }
}
