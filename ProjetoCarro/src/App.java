import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Carro meuCarro = new Carro();

        int opcao;       
    
        do {
        System.out.println("=== Painel Carro ===");
        System.out.println("1. Ligar Carro");
        System.out.println("2. Acelerar Carro");
        System.out.println("3. Verificar Velocidade");
        System.out.println("4. Trocar Marcha");
        System.out.println("5. Mudar direção");
        System.out.println("6. Diminuir Velocidade");
        System.out.println("7. Desligar");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();
        switch (opcao) {
            case 1 -> {
                if (!meuCarro.isLigado()) {
                    limpaTela();
                    meuCarro.ligar(); }
            } 
            case 2 -> {
                if (meuCarro.isLigado()) {
                    limpaTela();
                    meuCarro.acelerar(); } 
                    else {
                        System.out.println("Ligue o carro primeiro!");
                    }
            } 
            case 3 -> {
                if (meuCarro.isLigado()) {
                    limpaTela();
                    meuCarro.verificarVelocidade();} 
                    else {
                        System.out.println("Ligue o carro primeiro!");
                    }
            } 
            case 4 -> {
                if (meuCarro.isLigado()) {
                    limpaTela();
                    meuCarro.trocarMarcha(3);} 
                    else {
                        System.out.println("Ligue o carro primeiro!");
                    }
            } 
            case 5 -> {
                if (meuCarro.isLigado()) {
                    limpaTela();
                    meuCarro.virar("esquerda");} 
                    else {
                        System.out.println("Ligue o carro primeiro!");
                    }
            }    
            case 6 -> {
                if (meuCarro.isLigado()) {
                    limpaTela();
                    meuCarro.diminuirVelocidade(); } 
                    else {
                        System.out.println("Ligue o carro primeiro!");
                    }
            }    
            case 7 -> {
                if (meuCarro.isLigado()) {
                    limpaTela();
                    meuCarro.desligar();  } 
                    else {
                        System.out.println("Ligue o carro primeiro!");
                    }
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