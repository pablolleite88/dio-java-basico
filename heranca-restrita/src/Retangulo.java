public sealed class Retangulo extends Forma permits Quadrado {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um retângulo...");
    }
}