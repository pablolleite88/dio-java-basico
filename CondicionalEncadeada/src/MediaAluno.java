public class MediaAluno {

    public static void main(String[] args) {
        double media;
        double nota1 = 4;
        double nota2 = 3;
        double nota3 = 3;

        media = (nota1+nota2+nota3) / 3;

        System.out.println(media);

        if (media >= 7) {
            System.out.println("Media: " + media + ", Aprovado!");
        } else if( media < 7 && media >= 4) {
            System.out.println("Media: " + media + ", Em recuperacao!");
        } else if(media < 4) {
            System.out.println("Reprovado!");
        }
    }
}
