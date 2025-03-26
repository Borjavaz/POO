package Boletin10_1;

abstract class Inmueble {
    protected String rua;
    protected int numero;
    protected String localidade;
    protected double prezo;

    public Inmueble(String rua, int numero, String localidade, double prezo) {
        this.rua = rua;
        this.numero = numero;
        this.localidade = localidade;
        this.prezo = prezo;
    }

    public abstract double calcularGanancia(boolean venda);

    public abstract String mostrarDetalles();
}
