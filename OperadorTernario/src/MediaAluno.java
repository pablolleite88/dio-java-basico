public class MediaAluno {

    public static void main(String[] args) {
        double media;
        double nota1 = 4;
        double nota2 = 3;
        double nota3 = 3;

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println(media);

        String resultado = (media >= 7) ? "Media: " + media + ", Aprovado!" :
                (media >= 4) ? "Media: " + media + ", Em recuperacao!" :
                        "Reprovado!";

        System.out.println(resultado);
    }
}