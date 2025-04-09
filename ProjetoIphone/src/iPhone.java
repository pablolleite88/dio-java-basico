import java.util.ArrayList;
import java.util.List;

public class iPhone implements Reprodutor, Telefonico, Navegador {
    private String modelo;
    private String versaoOS;

    public iPhone(String modelo, String versaoOS) {
        this.modelo = modelo;
        this.versaoOS = versaoOS;
    }

    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    // Implementação dos métodos da interface Reprodutor
    private List<String> listaDeReproducoes = new ArrayList<>();
    private int volume;

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void ajustarVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume ajustado para: " + volume);
    }

    // Implementação dos métodos da interface Telefonico
    private List<String> contatos = new ArrayList<>();
    private String numeroAtual;

    @Override
    public void fazerChamada(String numero) {
        this.numeroAtual = numero;
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    public void adicionarContato(String contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato);
    }

    // Implementação dos métodos da interface Navegador
    private List<String> historico = new ArrayList<>();
    private String paginaAtual;

    @Override
    public void navegarPara(String url) {
        this.paginaAtual = url;
        historico.add(url);
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada: " + paginaAtual);
    }

    public void exibirHistorico() {
        System.out.println("Histórico de navegação: " + historico);
    }
}
