public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(int x, int y, int r, double h){
        super(x,y,r);

        setAltura(h);
    }

    public void setAltura(double h){
        if(h<0) altura = 0;
        else altura = h;
    }
    public double getAltura(){
        return altura;
    }

    public int  calcularVolumen(){
        return (int) (Math.PI * getRadio() * getRadio() * altura);
    }
    public int cacularVolumen(){
        return (int) (Math.PI * getRadio() * getRadio() * altura);
    }
    public String toString(){
        return "Radio: "+getRadio()+" Altura: "+altura;

    }
}
