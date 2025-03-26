package Boletin10_1;

class Garaxe extends Inmueble {
    private double ancho;
    private double longo;
    private int numPraza;
    private boolean tenAdegaOuTrasteiro;

    public Garaxe(String rua, int numero, String localidade, double prezo, double ancho, double longo, int numPraza, boolean tenAdegaOuTrasteiro) {
        super(rua, numero, localidade, prezo);
        this.ancho = ancho;
        this.longo = longo;
        this.numPraza = numPraza;
        this.tenAdegaOuTrasteiro = tenAdegaOuTrasteiro;
    }

    @Override
    public double calcularGanancia(boolean venda) {
        return venda ? prezo * 0.03 : prezo;
    }

    @Override
    public String mostrarDetalles() {
        return String.format("Garaxe en %s %d, %s - Prezo: %.2f€ - Praza: %d - Dimensións: %.2fm x %.2fm - Adega/Trasteiro: %s",
                rua, numero, localidade, prezo, numPraza, ancho, longo,
                tenAdegaOuTrasteiro ? "Si" : "Non");
    }
}