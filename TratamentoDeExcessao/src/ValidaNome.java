import java.util.Scanner;

public class ValidaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = null;

        while (nome == null) {
            try {
                System.out.print("Digite o nome da pessoa: ");
                nome = scanner.nextLine();

                if (nome.matches(".*\\d.*")) {
                    throw new IllegalArgumentException("O nome não pode conter números. Por favor, digite um nome válido.");
                }

                System.out.println("Nome digitado: " + nome);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                nome = null;  // Reinicia o loop se a entrada for inválida
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                nome = null;  // Reinicia o loop se ocorrer uma exceção inesperada
            }
        }

        scanner.close();
    }
}
