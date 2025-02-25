// Classe para testar a hierarquia de classes
public class Cinema {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Ingresso(30.0, "Vingadores: Ultimato", true);
        MeiaEntrada meiaEntrada = new MeiaEntrada(30.0, "Vingadores: Ultimato", true);
        IngressoFamilia ingressoFamilia = new IngressoFamilia(30.0, "Vingadores: Ultimato", true, 4);

        System.out.println("Ingresso normal: R$" + ingressoNormal.calcularValorReal());
        System.out.println("Meia entrada: R$" + meiaEntrada.calcularValorReal());
        System.out.println("Ingresso família: R$" + ingressoFamilia.calcularValorReal());
    }
}