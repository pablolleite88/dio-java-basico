import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        MaquinaDeBanho maquina = new MaquinaDeBanho();

        int opcao = 0;

        do {
            System.out.println("=== Painel Petshop ===");
            System.out.println("1. Dar banho no pet");
            System.out.println("2. Abastecer com agua");
            System.out.println("3. Abastecer com shampoo");
            System.out.println("4. Verificar nivel de agua");
            System.out.println("5. Verificar nivel de shampoo");
            System.out.println("6. Verificar Disponilidade");
            System.out.println("7. Colocar Pet na maquina");
            System.out.println("8. Retirar Pet da maquina");
            System.out.println("8. Limpar maquina");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {
                            limpaTela();
                            maquina.darBanho();
                }
                case 2 -> {
                            limpaTela();
                            maquina.abastecerAgua();
                }
                case 3 -> {
                            limpaTela();
                            maquina.abastecerShampoo();
                }
                case 4 -> {
                            limpaTela();
                            maquina.verificarNivelAgua();
                }
                case 5 -> {
                            limpaTela();
                            maquina.verificarNivelShampoo();
                }
                case 6 -> {
                            limpaTela();
                            maquina.verificarPetNoBanho();
                }
                case 7 -> {
                            limpaTela();
                            maquina.colocarPetNaMaquina();
                }
                case 8 -> {
                            limpaTela();
                            maquina.retirarPetDaMaquina();
                }
                case 9 -> {
                            limpaTela();
                            maquina.limparMaquina();
                }
            }
        } while (opcao != 0);
    }

    public static void limpaTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}