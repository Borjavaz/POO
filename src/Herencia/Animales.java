package Herencia;

// Clase base (superclase)
class Animales {
    String nombre;
    int edad;

    // Constructor de la clase base
    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo para hacer sonido( Será implewentado en las subclases)
    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    // Imprimir informacion
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

class Perro extends Animales {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    // Este metodo es propio de la clase perro
    void buscarPelota() {
        System.out.println(nombre + " está buscando la pelota.");
    }
}

class Gato extends Animales {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }

    // Este metodo es propio de la clase gato
    void ronronear() {
        System.out.println(nombre + " está ronroneando.");
    }
}


