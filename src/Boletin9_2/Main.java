package Boletin9_2;

public class Main {
    public static void main(String[] args) {

        //Creador de un obxecto usando o constructor sen parametros
        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50);
        consumo1.setpGas(1.57);
        System.out.println("Constructor 1 sin parametro:");
        consumo1.imprimir();
        System.out.println("  ");

        //Crear un obxecto usando o constructor con parametros
        Consumo consumo2 = new Consumo(500,40,100,1.50);
        System.out.println("Constructor 2 con parametro:");
        consumo2.imprimir();
        System.out.println("  ");

        //Datos del segundo

        System.out.println("Datos del Consumo 2:");
        System.out.println("  ");

        //Visualizar consumo medio do segundo obxecto
        System.out.println("Consumo medio: " + consumo2.consumoMedio());

        //Modificar os litros do segundo obxecto
        consumo2.setLitros(45);

        //Visualizar velocidad media do segundo obxecto
        System.out.println("Velocidad media: " +  consumo2.getpGas());
    }
}
