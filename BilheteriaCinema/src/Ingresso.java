// Classe base para todos os ingressos
class Ingresso {
    private double valor;
    private String nomeFilme;
    private boolean dublado;

    public Ingresso(double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public double getValor() {
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isDublado() {
        return dublado;
    }

    // Método a ser sobrescrito pelas subclasses para calcular o valor real do ingresso
    public double calcularValorReal() {
        return valor;
    }
}