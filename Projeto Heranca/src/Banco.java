import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso.");
    }

    public void exibirSaldos() {
        for (Conta conta : contas) {
            System.out.println("Titular: " + conta.getTitular());
            conta.exibirSaldo();
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("João", 1000, 500);
        ContaPoupanca cp = new ContaPoupanca("Maria", 2000, 0.05);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(200);
        cc.sacar(1500);
        cp.aplicarJuros();
        cp.sacar(500);

        banco.exibirSaldos();
    }
}