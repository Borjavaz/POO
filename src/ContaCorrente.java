public class ContaCorrente {
    private String numeroConta;
    private String nif;
    private String nomeTitular;
    private double saldo;
    public static int contadorContas = 0;

    public ContaCorrente(String numeroConta, String nif, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        setNif(nif);
        this.nomeTitular = nomeTitular;
        setSaldo(saldo);
        contadorContas++;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0.0)
        this.saldo = saldo;

    }

    public double getSaldo() {
        return saldo;
    }
    public static int getContadorContas(){
        return contadorContas;
    }

    public static void main(String[] args) {
        System.out.println(ContaCorrente.contadorContas);
        ContaCorrente contaManuel = new ContaCorrente( "123456789", "12345678J", "Manuel", 100.0);
        System.out.println(ContaCorrente.contadorContas);
        ContaCorrente contaBorja = new ContaCorrente("123456788", "17463292J", "Borja", 10000.0);
        System.out.println(ContaCorrente.contadorContas);
        ContaCorrente contaManu = new ContaCorrente("123456777", "32524327J", "Manu", -3000.0);
        System.out.println("Las cuentas registradas son: " + contadorContas);
    }
}
