public class Carro {

    // Características do carro
    private boolean ligado;
    private int potencia;
    private int velocidade;

    // Construtor da classe
    public Carro(int potencia) {
        this.ligado = false; // Carro começa desligado
        this.potencia = potencia;
        this.velocidade = 0;
    }

    // Métodos para ligar e desligar o carro
    public void ligar() {
        this.ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        this.ligado = false;
        this.velocidade = 0; // Velocidade volta a zero ao desligar
        System.out.println("Carro desligado.");
    }

    // Métodos para acelerar e frear
    public void acelerar() {
        if (this.ligado) {
            this.velocidade += 5;
            System.out.println("Velocidade aumentada para " + this.velocidade + " km/h.");
        } else {
            System.out.println("Carro está desligado. Não é possível acelerar.");
        }
    }

    public void frear() {
        if (this.ligado && this.velocidade > 0) {
            this.velocidade -= 5;
            if (this.velocidade < 0) {
                this.velocidade = 0; // Velocidade não pode ser negativa
            }
            System.out.println("Velocidade diminuída para " + this.velocidade + " km/h.");
        } else if (!this.ligado) {
            System.out.println("Carro está desligado. Não é possível frear.");
        } else {
            System.out.println("Carro já está parado.");
        }
    }

    // Método para aumentar a potência do carro
    public void aumentarPotencia() {
        this.potencia += 10;
        System.out.println("Potência aumentada para " + this.potencia + " cv.");
    }

    // Métodos getters para acessar as características do carro
    public boolean isLigado() {
        return this.ligado;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

}