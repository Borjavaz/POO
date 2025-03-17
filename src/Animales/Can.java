package Animales;

public class Can extends Mamiferos implements Comunicacion{

    public Can(String nombre, int edad) {
        super(nombre, edad);
    }

    public String parir(){
        return "Naceu un novo canciño";
    }

    public void desplazar(){
        System.out.println(getNombre() + " como can, desprazase correndo");
    }

    public void ronroneo(){
        System.out.println("ummm-ummm");
    }
    public void voz(){
        System.out.println("Guau guau");
    }
}
