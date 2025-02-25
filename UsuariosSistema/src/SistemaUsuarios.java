public class SistemaUsuarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", "joao@email.com", "senha123");
        Vendedor vendedor = new Vendedor("Maria", "maria@email.com", "senha456");
        Atendente atendente = new Atendente("Carlos", "carlos@email.com", "senha789");

        gerente.gerarRelatorioFinanceiro();
        vendedor.realizarVenda();
        atendente.receberPagamento(100.0);
        atendente.fecharCaixa();
    }
}