public class MediaAluno {

    public static void main(String[] args) {
        double media;
        double nota1 = 7;
        double nota2 = 7;
        double nota3 = 7;

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println(media);

        // Arredondamos a média para um inteiro, pois o switch case precisa de um valor discreto
        int mediaArredondada = (int) Math.round(media);

        switch (mediaArredondada) {
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Media: " + media + ", Aprovado!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Media: " + media + ", Em recuperacao!");
                break;
            default:
                System.out.println("Reprovado!");
        }
    }
}