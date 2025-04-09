public class Email implements ServicoMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}