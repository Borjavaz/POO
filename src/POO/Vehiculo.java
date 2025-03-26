package POO;

// Clase base abstracta (Abstracción)
abstract class Vehiculo {
    // Atributos encapsulados (Encapsulamiento)
    private String marca;
    private String modelo;
    private int ano;

    // Constructor
    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método abstracto (Abstracción)
    public abstract void mostrarDetalles();

    // Método común
    public void encender() {
        System.out.println("El vehículo está encendido.");
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
}

// Subclase Coche que hereda de Vehiculo (Herencia)
class Coche extends Vehiculo {
    private int puertas;

    // Constructor
    public Coche(String marca, String modelo, int ano, int puertas) {
        super(marca, modelo, ano);
        this.puertas = puertas;
    }

    // Implementación del método abstracto (Polimorfismo)
    @Override
    public void mostrarDetalles() {
        System.out.println("Coche: " + getMarca() + " " + getModelo() + " (" + getAno() + ") - " + puertas + " puertas");
    }
}

// Subclase Moto que hereda de Vehiculo (Herencia)
class Moto extends Vehiculo {
    private boolean caballito;

    public Moto(String marca, String modelo, int ano, boolean caballito) {
        super(marca, modelo, ano);
        this.caballito = caballito;
    }

    // Implementación del método abstracto (Polimorfismo)
    @Override
    public void mostrarDetalles() {
        System.out.println("Moto: " + getMarca() + " " + getModelo() + " (" + getAno() + ") - Hace caballito: " + (caballito ? "Sí" : "No"));
    }
}

// Interfaz para vehículos eléctricos (Interfaces)
interface VehiculoElectrico {
    void cargarBateria();
}

// Clase Tesla que hereda de Coche e implementa la interfaz VehiculoElectrico
class Tesla extends Coche implements VehiculoElectrico {
    private int autonomia;

    public Tesla(String modelo, int ano, int autonomia) {
        super("Tesla", modelo, ano, 4);
        this.autonomia = autonomia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tesla: " + getModelo() + " (" + getAno() + ") - Autonomía: " + autonomia + " km");
    }

    // Implementación del método de la interfaz
    @Override
    public void cargarBateria() {
        System.out.println("Cargando batería del Tesla...");
    }
}