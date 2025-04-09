public class RedesSociais implements ServicoMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem para Redes Sociais: " + mensagem);
    }
}