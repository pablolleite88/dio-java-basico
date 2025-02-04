public class App {
    public static void main(String[] args) throws Exception {
        
        // Tipos inteiros
        byte umByte = 127;
        short umShort = 32767;
        int umInt = 2147483647;
        long umLong = 9223372036854775807L;

        // Tipos de ponto flutuante
        float umFloat = 3.14f;
        double umDouble = 3.141592653589793;

        // Tipo caractere
        char umChar = 'A';

        // Tipo booleano
        boolean umBoolean = true;

        // Exibindo os valores
        System.out.println("byte: " + umByte);
        System.out.println("short: " + umShort);
        System.out.println("int: " + umInt);
        System.out.println("long: " + umLong);
        System.out.println("float: " + umFloat);
        System.out.println("double: " + umDouble);
        System.out.println("char: " + umChar);
        System.out.println("boolean: " + umBoolean);

        // Definindo uma constante
        final int MINHA_CONSTANTE = 100;

        // Tentativa de alterar o valor da constante resultará em erro de compilação
        
        //MINHA_CONSTANTE = 200; // Isso causará um erro

        System.out.println("O valor da constante é: " + MINHA_CONSTANTE);


    }
}
