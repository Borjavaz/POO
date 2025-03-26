package Abstraccion;

abstract class Electrodomestico {
    String marca;
    int potencia; // En vatios (W)

    public Electrodomestico(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    // Métodos abstractos que deben ser implementados por las subclases
    abstract void encender();
    abstract void apagar();

    // Mwtodo para mostrar informacion
    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Potencia: " + potencia + "W");
    }
}

// Subclase Televisor
class Televisor extends Electrodomestico {
    int canalActual;

    public Televisor(String marca, int potencia) {
        super(marca, potencia);
        this.canalActual = 1; // Canal por defecto
    }

    @Override
    void encender() {
        System.out.println("El televisor " + marca + " está encendido.");
    }

    @Override
    void apagar() {
        System.out.println("El televisor " + marca + " está apagado.");
    }

    // Metodo exclusivo del televisor
    void cambiarCanal(int canal) {
        this.canalActual = canal;
        System.out.println("Televisor cambiado al canal " + canalActual);
    }
}

// Subclase Lavadora
class Lavadora extends Electrodomestico {
    public Lavadora(String marca, int potencia) {
        super(marca, potencia);
    }

    @Override
    void encender() {
        System.out.println("La lavadora " + marca + " ha comenzado a funcionar.");
    }

    @Override
    void apagar() {
        System.out.println("La lavadora " + marca + " está apagada.");
    }

    // Mwtodo exclusivo de la lavadora
    void iniciarLavado() {
        System.out.println("La lavadora " + marca + " está lavando la ropa.");
    }
}


