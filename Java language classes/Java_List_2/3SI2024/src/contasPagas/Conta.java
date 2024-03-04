package contasPagas;

public class Conta {
    private int idConta;
    private String dataVencimento, dataPagamento;
    Produto pro;
    Cliente cli;

    void visualizarConta(){
        System.out.println(
                         "##################\n CONTAS PAGAS: \n IDENTIFICADOR: " + this.idConta + "\n PRODUTO: " + this.pro.getNome() +
                        "\n CLIENTE: " + this.cli.getNomeCliente() + "  CPF: " + this.cli.getCpf()
                        + "\n VALOR: " + this.pro.getValorProduto() + "\n DATA VENCIMENTO: " + this.dataVencimento
                        + "\n DATA PAGAMENTO: "+ this.dataPagamento + "\n##################");
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Produto getPro() {
        return pro;
    }

    public void setPro(Produto pro) {
        this.pro = pro;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
}
