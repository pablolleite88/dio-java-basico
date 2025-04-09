public class Atendente  extends Usuario{

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false); // Atendente não é administrador
        this.valorEmCaixa = 0.0;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento recebido com sucesso.");
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor em caixa: R$" + valorEmCaixa);
        valorEmCaixa = 0.0; // Zera o valor em caixa
    }
    
}
