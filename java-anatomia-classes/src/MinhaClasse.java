public class MinhaClasse {

    public static void main(String[] args) {
        
        String primeiroNome = "Pablo";
        String segundoNome = "Luis";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String a, String b) {
        return a.concat(" ").concat(b);
    }
}
