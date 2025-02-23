public class ContaBancaria {

    private double saldoOriginal; // Saldo sem o cheque especial
    private double saldo;
    private double chequeEspecial;

    public ContaBancaria(double chequeEspecial, double depositoInicial) {
        this.chequeEspecial = chequeEspecial;
        this.saldoOriginal = depositoInicial;
        this.saldo = depositoInicial + chequeEspecial;
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
        return saldo ;
    }

    public double consultarChequeEspecial() {
        return  chequeEspecial;
    }
    
    public void depositarDinheiro(double valor) {
        saldo = saldo + valor;
    }

    public String pagarBoleto(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            return "Pagamento efetuado!";
        } else {
            return "Saldo insuficiente";
        }
    }

    public String sacarDinheiro(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            return "Saque efetuado!";
        } else {
            return "Saldo insuficiente";
        }
    }

    public boolean verificarChequeEspecial() {
        return saldo < saldoOriginal;
    }
}