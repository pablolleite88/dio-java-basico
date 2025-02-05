public class App {

    public static int somar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static void main(String[] args) {
        int resultadoSoma = somar(5, 3);
        System.out.println("A soma é: " + resultadoSoma); // Imprime "A soma é: 8"
    }
}
