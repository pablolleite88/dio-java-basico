import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void exibirTodosContatos() {
        for (Contato contato : contatos) {
            contato.exibirDetalhes(); // Polimorfismo em ação!
            System.out.println("---");
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato pessoal1 = new ContatoPessoal("Ana", "1234-5678", "ana@email.com");
        Contato profissional1 = new ContatoProfissional("João", "9876-5432", "Empresa X");

        agenda.adicionarContato(pessoal1);
        agenda.adicionarContato(profissional1);

        agenda.exibirTodosContatos();
    }
}