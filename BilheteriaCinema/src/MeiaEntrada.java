// Classe para ingressos de meia entrada
class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, String nomeFilme, boolean dublado) {
        super(valor, nomeFilme, dublado);
    }

    @Override
    public double calcularValorReal() {
        return getValor() / 2;
    }
}