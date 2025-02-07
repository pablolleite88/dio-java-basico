package br.com.psg;

public class Jogadores {

    private String nome;
    private double salario;
    private int numeroCamisa;
    private String posicao;
    private int idade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getNumeroCamisa() {
        return numeroCamisa;
    }
    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Jogadores(String nome, double salario, int numeroCamisa, String posicao, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
        this.idade = idade;
    }

    

}
