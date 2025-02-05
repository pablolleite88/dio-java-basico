public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}