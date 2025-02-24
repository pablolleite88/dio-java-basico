public class ContatoPessoal extends Contato {
    private String email;

    public ContatoPessoal(String nome, String telefone, String email) {
        super(nome, telefone);
        this.email = email;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Email: " + email);
    }
}