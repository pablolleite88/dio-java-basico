## Projeto Agenda com Herança e Polimorfismo

Herança: ContatoPessoal e ContatoProfissional herdam de Contato, reutilizando os atributos e métodos da classe base.
Polimorfismo: No método exibirTodosContatos() da classe Agenda, o método exibirDetalhes() é chamado para cada contato na lista. No entanto, o comportamento desse método é diferente dependendo do tipo de contato (pessoal ou profissional). Isso é polimorfismo em ação, onde um único método pode ter comportamentos diferentes dependendo do objeto que o chama.