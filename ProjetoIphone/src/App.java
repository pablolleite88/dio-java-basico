public class App {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone("iPhone 1", "iOS 1.0");

        meuIPhone.ligar();

        // Usando funcionalidades de ReprodutorMusical
        meuIPhone.tocar();
        meuIPhone.ajustarVolume(5);
        meuIPhone.pausar();

        // Usando funcionalidades de AparelhoTelefonico
        meuIPhone.fazerChamada("123456789");
        meuIPhone.encerrarChamada();
        meuIPhone.adicionarContato("Amigo");

        // Usando funcionalidades de NavegadorInternet
        meuIPhone.navegarPara("http://example.com");
        meuIPhone.atualizarPagina();
        meuIPhone.exibirHistorico();

        meuIPhone.desligar();
    }
}
