package Boletin9_2;

public class Consumo {

    private double km;
    private double litros;
    private double vMed; //velocidade media
    private double pGas; // Prezo da gasolina

    //Constructor por defecto
    public Consumo(){
        this.km = 0.0;
        this.litros = 0.0;
        this.vMed = 0.0;
        this.pGas = 0.0;
    }

    //Constructor con parametros
    public Consumo(double km, double litros, double vMed, double pGas) {
       this.km = km;
       this.litros = litros;
       this.vMed = vMed;
       this.pGas = pGas;
    }

    //Set y Get
    public double getKm() {return km;}
    public void setKm(double km) {this.km = km;}
    public double getLitros() {return litros;}
    public void setLitros(double litros) {this.litros = litros;}
    public double getvMed() {return vMed;}
    public void setvMed(double vMed) {this.vMed = vMed;}
    public double getpGas() {return pGas;}
    public void setpGas(double pGas) {this.pGas = pGas;}


    //O tempo en horas. Se a velocidade media é 0, devolve 0.
    public double getTempo() {
        if (vMed > 0) {
            return km / vMed;
        } else {
            return 0;
        }
    }

    //Consumo en litros por cada 100 km. Se os km son 0, devolve 0.
    public double consumoMedio() {
        if (km > 0) {
            return (litros * 100) / km;
        } else {
            return 0;
        }
    }

    //Custo do combustible en euros por cada 100 km
    public double consumoEuros() {
        return consumoMedio() * pGas;
    }

    public void imprimir(){
        System.out.println("Km: " + this.km);
        System.out.println("Litros: " + this.litros);
        System.out.println("VMed: " + this.vMed);
        System.out.println("PGas: " + this.pGas);

    }
}
