public class Main {

    public static void main(String[] args) {
        // Criando um carro com 150 cv de potência
        Carro meuCarro = new Carro(150);

        // Ligando o carro
        meuCarro.ligar();

        // Acelerando o carro
        meuCarro.acelerar();
        meuCarro.acelerar();

        // Freando o carro
        meuCarro.frear();

        // Aumentando a potência do carro
        meuCarro.aumentarPotencia();

        // Desligando o carro
        meuCarro.desligar();
    }

}
