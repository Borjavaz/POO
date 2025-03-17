package Examen;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    //Constructor con parametros
    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    //Getters y setters
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public int getVelocidad() {return velocidad;}
    public void setVelocidad(int velocidad) {this.velocidad = velocidad;}


    //Metodo que permite acelerar
    public void acelerar(int incremento){
        this.velocidad += incremento;
    }

    //Metodo que permite frenar
    public void frenar(int decremento){
        this.velocidad -= decremento;
    }

    //Metodo para mostrar los datos del coche
    public void mostrar(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad: " + this.velocidad);
    }





}

