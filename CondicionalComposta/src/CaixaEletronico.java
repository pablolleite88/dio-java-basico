public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 10.99;
        double solicitacaoSaque = 13.99;

        if ( solicitacaoSaque < saldo) {
            saldo = saldo - solicitacaoSaque;
            System.out.println(saldo);
        } else
        {
            System.out.println("Saldo insuficiente. Saldo atual: " + saldo);
        }
    }
}
