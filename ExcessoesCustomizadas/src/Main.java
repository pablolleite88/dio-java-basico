import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            Pessoa pessoa = new Pessoa(nome, idade);
            System.out.println(pessoa);

        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
