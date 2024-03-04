package contasPagas;

public class Programa {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();

        cli1.setNomeCliente("Teteus");
        cli2.setNomeCliente("Leleo");
        cli1.setCpf("52062132840");
        cli2.setCpf("19019019010");

        Produto pro1 = new Produto();
        Produto pro2 = new Produto();
        pro1.setDescricaoProduto("Desinfeta as paradas");
        pro2.setDescricaoProduto("Coquinha gelada hummmm");
        pro1.setNome("Desinfetante");
        pro2.setNome("Coquinha");
        pro1.setValorProduto(60);
        pro2.setValorProduto(20);

        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.setCli(cli1);
        c2.setCli(cli2);
        c1.setPro(pro1);
        c2.setPro(pro2);
        c1.setIdConta(1);
        c2.setIdConta(2);
        c1.setDataVencimento("21/09/2004");
        c2.setDataVencimento("09/04/2020");
        c1.setDataPagamento("15/06/1987");
        c2.setDataPagamento("28/01/1947");

        c1.visualizarConta();
        c2.visualizarConta();

    }
}
