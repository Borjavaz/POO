package Boletin10_1;

class LocalComercial extends Inmueble {
    private int portal;
    private int piso;
    private double metrosCadrados;
    private boolean acondicionado;
    private boolean fachadaRua;
    private boolean entradaMercadorias;
    private String observacions;

    public LocalComercial(String rua, int numero, String localidade, double prezo, int portal, int piso, double metrosCadrados,
                          boolean acondicionado, boolean fachadaRua, boolean entradaMercadorias, String observacions) {
        super(rua, numero, localidade, prezo);
        this.portal = portal;
        this.piso = piso;
        this.metrosCadrados = metrosCadrados;
        this.acondicionado = acondicionado;
        this.fachadaRua = fachadaRua;
        this.entradaMercadorias = entradaMercadorias;
        this.observacions = observacions;
    }

    @Override
    public double calcularGanancia(boolean venda) {
        return venda ? prezo * 0.02 : prezo;
    }

    @Override
    public String mostrarDetalles() {
        return String.format("Local Comercial en %s %d, %s - Prezo: %.2f€ - %dm² - Acondicionado: %s - Fachada: %s - Entrada Mercadorías: %s - Observacións: %s",
                rua, numero, localidade, prezo, (int) metrosCadrados, acondicionado ? "Si" : "Non",
                fachadaRua ? "Si" : "Non", entradaMercadorias ? "Si" : "Non", observacions);
    }
}