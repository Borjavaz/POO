package Boletin9_4;

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

    public void imprimir() {
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Nif: " + nif);
        System.out.println("Nome Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        ContaCorrente contaManuel = new ContaCorrente( "123456789", "12345678J", "Manuel", 100.0);
        System.out.println("Numero de cuenta: " + contaManuel.numeroConta +  "\nNif: " + contaManuel.nif +  "\nNome Titular: " + contaManuel.nomeTitular +  "\nSaldo: " + contaManuel.saldo );
        System.out.println("  ");
        ContaCorrente contaBorja = new ContaCorrente("123456788", "17463292J", "Borja", 10000.0);
        System.out.println("Numero de cuenta: " + contaBorja.numeroConta +  "\nNif: " + contaBorja.nif +  "\nNome Titular: " + contaBorja.nomeTitular +  "\nSaldo: " + contaBorja.saldo );
        System.out.println("  ");
        ContaCorrente contaManu = new ContaCorrente("123456777", "32524327J", "Manu", -3000.0);
        System.out.println("Numero de cuenta: " + contaManu.numeroConta +  "\nNif: " + contaManu.nif +  "\nNome Titular: " + contaManu.nomeTitular +  "\nSaldo: " + contaManu.saldo );
        System.out.println("  ");
        System.out.println("Las cuentas registradas son: " + contadorContas);
    }
}