package Geometria;

public class Circulo extends Punto {
    public double radio;

    public Circulo(int x, int y, int r){
        super(x,y);
        radio = r;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double r){
        radio = r;
    }

    public double area(double radio){return Math.PI*radio*radio;}

    public double perimetro(){
        return 2*Math.PI*radio;
    }



    /*class bateriaTest(){

        @Test
        void testArea(){
            Circulo c = new Circulo(1,2,3);

        }
    }
*/

    public static void main(String[] args) {
        Circulo c = new Circulo(1,2,3);
        System.out.println("Radio: "+c.getRadio());
        System.out.println("Area: "+c.area(3.0));
        System.out.println("Perimetro: "+c.perimetro());
        System.out.println(" ");

        c.setRadio(5);
        System.out.println("Radio: "+c.getRadio());
        System.out.println("Area: "+c.area(3.0));
        System.out.println("Perimetro: "+c.perimetro());
        System.out.println(" ");

    }
}