// Classe para ingressos família
class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int numeroPessoas) {
        super(valor, nomeFilme, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double calcularValorReal() {
        double valorTotal = getValor() * numeroPessoas;
        if (numeroPessoas > 3) {
            valorTotal *= 0.95; // Aplica desconto de 5%
        }
        return valorTotal;
    }
}
