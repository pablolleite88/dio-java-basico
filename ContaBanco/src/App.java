import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Digite o número da conta:");
        contaTerminal.setNumeroConta(scanner.nextInt());
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o número da Agencia:");
        contaTerminal.setAgencia(scanner.nextLine());

        System.out.println("Digite o nome do Cliente:");
        contaTerminal.setNomeCliente(scanner.nextLine());

        System.out.println("Deposito inicial:");
        contaTerminal.setSaldo(scanner.nextDouble());


        System.out.println("Olá " + contaTerminal.getNomeCliente() + " , obrigado por criar uma conta em nosso banco,\n" + 
        "sua agência é " + contaTerminal.getAgencia() +", conta " + contaTerminal.getNumeroConta() + 
        " e seu saldo " + contaTerminal.getSaldo() + " já está disponível para saque");
    }
}
