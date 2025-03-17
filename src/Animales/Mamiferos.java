package Animales;

public abstract class Mamiferos extends Animal {
    public Mamiferos(String nombre, int edad) {
        super(nombre, edad);
    }

    public abstract void voz();

    public void mamar(){
        System.out.println(getNombre() + "está mamando");
    }



}
