public class EnvioMensagensMarketing {
    public static void main(String[] args) {
        Marketing marketing = new Marketing();
        String mensagem = "Promoção imperdível! Descontos de até 50%!";

        // Envia mensagem para um serviço específico
        marketing.enviarMensagem(mensagem, new SMS());

        // Envia mensagem para todos os serviços usando lambda
        marketing.enviarMensagemParaTodos(mensagem, servico -> servico.enviar(mensagem));
    }
}