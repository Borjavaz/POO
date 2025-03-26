package Boletin10_1;

class Vivenda extends Inmueble {
    private int portal;
    private int piso;
    private int numHabitacions;
    private boolean tenGaraxe;
    private boolean tenTrasteiro;
    private boolean tenAdega;
    private String observacions;

    public Vivenda(String rua, int numero, String localidade, double prezo, int portal, int piso, int numHabitacions,
                   boolean tenGaraxe, boolean tenTrasteiro, boolean tenAdega, String observacions) {
        super(rua, numero, localidade, prezo);
        this.portal = portal;
        this.piso = piso;
        this.numHabitacions = numHabitacions;
        this.tenGaraxe = tenGaraxe;
        this.tenTrasteiro = tenTrasteiro;
        this.tenAdega = tenAdega;
        this.observacions = observacions;
    }

    @Override
    public double calcularGanancia(boolean venda) {
        return venda ? prezo * 0.02 : prezo;
    }

    @Override
    public String mostrarDetalles() {
        return String.format("Vivenda en %s %d, %s - Prezo: %.2f€ - %d habitacións - Garaxe: %s - Trasteiro: %s - Adega: %s - Observacións: %s",
                rua, numero, localidade, prezo, numHabitacions,
                tenGaraxe ? "Si" : "Non", tenTrasteiro ? "Si" : "Non", tenAdega ? "Si" : "Non", observacions);
    }
}