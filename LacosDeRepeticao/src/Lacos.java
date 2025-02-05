public class Lacos {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        // Uso do loop for para percorrer o vetor
        System.out.println("Usando o loop for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Uso do loop while para percorrer o vetor
        System.out.println("Usando o loop while:");
        int j = 0;
        while (j < numeros.length) {
            System.out.println(numeros[j]);
            j++;
        }

        // Uso do loop do-while para percorrer o vetor
        System.out.println("Usando o loop do-while:");
        int k = 0;
        do {
            System.out.println(numeros[k]);
            k++;
        } while (k < numeros.length);

        // Uso do loop for-each para percorrer o vetor
        System.out.println("Usando o loop for-each:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
