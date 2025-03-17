package Boletin9_1;

public class Principal{
    public static void main(String[] args) {

        //Creador de libro con valores por defecto
        Libro libro1 = new Libro();

        libro1.setTitulo("El señor dos Aneis");
        libro1.setAutor("J.R.R. Tolkien");
        libro1.setAno(1954);
        libro1.setNumPaginas((short)1178);
        libro1.setValoracion(4.8f);

        System.out.println("Libro 1");
        libro1.imprimir();

        //Crear libro co segundo constructor
        Libro libro2 = new Libro("El Quijote","Cervantes",1949,(short)1500,5.5f);
        System.out.println("Libro 2");
        libro2.imprimir();




    }
}
