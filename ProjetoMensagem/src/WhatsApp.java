public class WhatsApp implements ServicoMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
