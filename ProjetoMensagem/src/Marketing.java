import java.util.function.Consumer;

public class Marketing {
        public void enviarMensagem(String mensagem, ServicoMensagem servico) {
        servico.enviar(mensagem);
    }

    // Método usando lambda para enviar mensagens para vários serviços
    public void enviarMensagemParaTodos(String mensagem, Consumer<ServicoMensagem> acao) {
        acao.accept(new SMS());
        acao.accept(new Email());
        acao.accept(new RedesSociais());
        acao.accept(new WhatsApp());
    }
}

