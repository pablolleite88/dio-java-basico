package br.com.psg;

import java.util.ArrayList;
import java.util.List;

public class Times {

    private List<Jogadores> jogadores;
    private String nome;
    private String tecnico;

    public Times(String nome, String tecnico) {
        this.jogadores = new ArrayList<>();
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public void adicionarJogador(Jogadores jogador) {
        this.jogadores.add(jogador);
    }

    public List<Jogadores> getJogadores() {
        return jogadores;
    }

}
