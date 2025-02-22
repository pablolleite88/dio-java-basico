public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;

    public ContaBancaria(double chequeEspecial, double saldo) {
        this.chequeEspecial = chequeEspecial;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double consultarSaldo() {
        return saldo + chequeEspecial;
    }

    public double consultarChequeEspecial() {
        return  chequeEspecial;
    }
    
    public void depositarDinheiro(double valor) {
        saldo = saldo + valor;
    }
}