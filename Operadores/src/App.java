public class App {
    public static void main(String[] args) throws Exception {
        // Operadores aritméticos
        int soma = 10 + 5; // Soma: 15
        int subtracao = 10 - 5; // Subtração: 5
        int multiplicacao = 10 * 5; // Multiplicação: 50
        int divisao = 10 / 5; // Divisão: 2
        int resto = 10 % 3; // Resto da divisão: 1

        // Operadores de atribuição
        int numero = 10; // Atribuição simples
        numero += 5; // Adição e atribuição: numero = numero + 5 (15)
        numero -= 5; // Subtração e atribuição: numero = numero - 5 (10)
        numero *= 2; // Multiplicação e atribuição: numero = numero * 2 (20)
        numero /= 2; // Divisão e atribuição: numero = numero / 2 (10)
        numero %= 3; // Resto e atribuição: numero = numero % 3 (1)

        // Operadores relacionais
        boolean igual = 10 == 10; // Igualdade: true
        boolean diferente = 10 != 5; // Desigualdade: true
        boolean maior = 10 > 5; // Maior que: true
        boolean menor = 10 < 15; // Menor que: true
        boolean maiorOuIgual = 10 >= 10; // Maior ou igual a: true
        boolean menorOuIgual = 10 <= 15; // Menor ou igual a: true

        // Operadores lógicos
        boolean verdadeiro = true;
        boolean falso = false;

        boolean e = verdadeiro && falso; // Conjunção (AND): false
        boolean ou = verdadeiro || falso; // Disjunção (OR): true
        boolean nao = !verdadeiro; // Negação (NOT): false

        // Operador ternário
        int resultado = (10 > 5) ? 100 : 200; // Se 10 > 5, resultado = 100, senão resultado = 200 (100)

        // Operadores de incremento e decremento
        int contador = 0;
        contador++; // Incremento: contador = contador + 1 (1)
        contador--; // Decremento: contador = contador - 1 (0)

        // Imprime os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        System.out.println("Número: " + numero);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou igual: " + maiorOuIgual);
        System.out.println("Menor ou igual: " + menorOuIgual);
        System.out.println("E: " + e);
        System.out.println("Ou: " + ou);
        System.out.println("Não: " + nao);
        System.out.println("Resultado ternário: " + resultado);
        System.out.println("Contador: " + contador);
    }
}
