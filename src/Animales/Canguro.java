package Animales;

public class Canguro extends Mamiferos{

    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }
    public void desplazar(){
        System.out.println(getNombre() + " como canguro, se desplaza dando chimpos");
    }
    public String parir(){
        return "Naceu un canguro bebé";
    }
    public void ronroneo(){
        System.out.println("ahhh-ahhh");
    }
    @Override
    public void voz(){
        System.out.println("Ehiiiiiiiaaa");
    }
}
