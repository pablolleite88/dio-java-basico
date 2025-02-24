public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;
    private String direcao;

    // Construtor
    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
        this.direcao = "em frente";
    }   

    

    public boolean isLigado() {
        return ligado;
    }

    // Métodos
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado && velocidade == 00 && marcha == 0) {
            ligado = false;
            velocidade = 0;
            marcha = 0;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro não pode ser desligado enquanto estiver em movimento ou fora do ponto morto.");
        }
    }

    public void acelerar() {
        if (ligado) {

            if (velocidade == 0 && marcha == 0) {
                marcha = 1;
            }

            if (velocidade < 120) {
                velocidade += 1;
                ajustarMarcha();
                System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h.");
            } else {
                System.out.println("Velocidade máxima atingidade: " + velocidade + " km/h.");
            }

        } else {
            System.out.println("Não é possível acelerar com o carro desligado.");
        }
    }

    public void diminuirVelocidade() {
        if (ligado && velocidade > 0) {
            velocidade -= 1;
            ajustarMarcha();
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("Diminuindo a velocidade. Velocidade atual: " + velocidade + " km/h.");
        } else if (!ligado) {
            System.out.println("Não é possível diminuir a velocidade com o carro desligado.");
        } else {
            System.out.println("Reduza a velocidade até 40 km/h.");
        }
    }

    public void virar(String novaDirecao) {
        if (ligado && velocidade >= 1 && velocidade <= 40) {
            direcao = novaDirecao;
            System.out.println("Virando para " + direcao + ".");
        } else if (!ligado) {
            System.out.println("Não é possível virar com o carro desligado.");
        } else {
            System.out.println("A velocidade deve estar entre 1 km/h e 40 km/h para virar.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h.");
    }

    public void trocarMarcha(int novaMarcha) {
        if (ligado) {
            if (novaMarcha >= 1 && novaMarcha <= 6 && Math.abs(novaMarcha - marcha) == 1) {
                marcha = novaMarcha;
                System.out.println("Marcha trocada para: " + marcha);
            } else {
                System.out.println("Marcha inválida ou pulo de marcha não permitido.");
            }
        } else {
            System.out.println("Não é possível trocar a marcha com o carro desligado.");
        }
    } 
    
    private void ajustarMarcha() {
        if (velocidade <= 20) {
            marcha = 1;
        } else if (velocidade <= 40) {
            marcha = 2;
        } else if (velocidade <= 60) {
            marcha = 3;
        } else if (velocidade <= 80) {
            marcha = 4;
        } else if (velocidade <= 100) {
            marcha = 5;
        } else {
            marcha = 6;
        }
    }

}
