package br.com.psg;

public class Main {

    public static void main(String[] args) {
        Jogadores jogador1 = new Jogadores("Neymar", 1000000, 10, "Atacante", 33);
        Jogadores jogador2 = new Jogadores("Messi", 1500000, 10, "Atacante", 37);

        Times time1 = new Times("Paris Saint-Germain", "Christophe Galtier");

        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);

        System.out.println(time1.getJogadores());

    }

}
