public class App {
    public static void main(String[] args) throws Exception {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b)); // Adição
        System.out.println("a - b = " + (a - b)); // Subtração
        System.out.println("a * b = " + (a * b)); // Multiplicação
        System.out.println("a / b = " + (a / b)); // Divisão
        System.out.println("a % b = " + (a % b)); // Módulo

        // Operadores de incremento e decremento
        int c = 10;
        System.out.println("c++ = " + (c++)); // Pós-incremento
        System.out.println("++c = " + (++c)); // Pré-incremento
        System.out.println("c-- = " + (c--)); // Pós-decremento
        System.out.println("--c = " + (--c)); // Pré-decremento

        // Operadores relacionais
        System.out.println("a == b: " + (a == b)); // Igual a
        System.out.println("a != b: " + (a != b)); // Diferente de
        System.out.println("a > b: " + (a > b)); // Maior que
        System.out.println("a < b: " + (a < b)); // Menor que
        System.out.println("a >= b: " + (a >= b)); // Maior ou igual a
        System.out.println("a <= b: " + (a <= b)); // Menor ou igual a

        // Operadores lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // E lógico
        System.out.println("x || y: " + (x || y)); // OU lógico
        System.out.println("!x: " + (!x)); // NÃO lógico

        // Operadores bitwise
        int m = 6; // 110 em binário
        int n = 4; // 100 em binário
        System.out.println("m & n: " + (m & n)); // E bit a bit
        System.out.println("m | n: " + (m | n)); // OU bit a bit
        System.out.println("m ^ n: " + (m ^ n)); // OU exclusivo bit a bit
        System.out.println("~m: " + (~m)); // NÃO bit a bit
        System.out.println("m << 1: " + (m << 1)); // Deslocamento à esquerda
        System.out.println("m >> 1: " + (m >> 1)); // Deslocamento à direita
    }
}
