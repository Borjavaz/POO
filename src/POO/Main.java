package POO;

// Clase principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        // Creación de objetos
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 4);
        Moto moto1 = new Moto("Honda", "CBR", 2021, true);
        Tesla tesla1 = new Tesla("Model S", 2023, 600);

        // Uso del polimorfismo
        Vehiculo[] vehiculos = { coche1, moto1, tesla1 };

        for (Vehiculo v : vehiculos) {
            v.mostrarDetalles();
            v.encender();
            System.out.println();
        }

        // Uso de la interfaz
        tesla1.cargarBateria();
    }

    /*
        · Clase Vehiculo: Es abstracta y define un método mostrarDetalles() que debe ser implementado por sus subclases.
        · Clase Coche y Moto: Heredan de Vehiculo y sobrescriben el método mostrarDetalles(), aplicando polimorfismo.
        · Interfaz VehiculoElectrico: Define un método cargarBateria(), que es implementado en Tesla.
        · Clase Tesla: Hereda de Coche y también implementa la interfaz VehiculoElectrico.
        · Uso del polimorfismo: Se usa un arreglo de Vehiculo[] para almacenar distintos tipos de vehículos y llamar a mostrarDetalles() de manera genérica.
        · Interfaz en acción: Tesla implementa VehiculoElectrico y usa su método cargarBateria().
     */
}