import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    ContaBancaria conta1;
    double chequeEspecial = 0;

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.executar();
    }

    public void executar() {
        int opcao;
        double saldo;
        double deposito;

        do {
            System.out.println("=== Menu Banco ===");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consultar Cheque Especial");
            System.out.println("3. Depositar Dinheiro");
            System.out.println("4. Sacar Dinheiro");
            System.out.println("5. Pagar Boleto");
            System.out.println("6. Verificar Cheque Especial");
            System.out.println("7. Abrir Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    if (conta1 != null) {
                        System.out.println("Saldo: " + conta1.consultarSaldo());
                    } else {
                        System.out.println("Conta não aberta.");
                    }
                }
                case 2 -> {
                    if (conta1 != null) {
                        System.out.println("Cheque Especial: " + conta1.consultarChequeEspecial());
                    } else {
                        System.out.println("Conta não aberta.");
                    }
                }
                case 3 -> {
                    System.out.println("Informe o valor a depositar: ");
                    deposito = scanner.nextDouble();
                    depositarDinheiro(deposito);
                }
                case 4 -> {
                }
                case 5 -> System.out.println("Funcionalidade não implementada.");
                case 6 -> System.out.println("Funcionalidade não implementada.");
                case 7 -> {
                    System.out.println("Informe o depósito inicial: ");
                    saldo = scanner.nextDouble();
                    abrirConta(saldo);
                }
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public void abrirConta(double valor) {
        if (valor >= 500) {
            chequeEspecial = valor * 1.5;
        } else {
            chequeEspecial = 50;
        }
        conta1 = new ContaBancaria(chequeEspecial, valor);
        System.out.println("Conta aberta com sucesso!");
    }

    public void depositarDinheiro(double deposito) {
        conta1.depositarDinheiro(deposito);
        System.out.println("Deposito realizado, saldo atual: " + conta1.consultarSaldo());
    }
}