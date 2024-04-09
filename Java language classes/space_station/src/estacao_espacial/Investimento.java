package estacao_espacial;

public class Investimento {
    private String organizacao, data;
    private int valorTotal;

    public String getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    void mostraInvestimento (){
        System.out.println("############ Investimento ##############\n");
        System.out.println("Apoio da Organização: "+ this.organizacao);
        System.out.println("Data: "+ this.data);
        System.out.println("Total de Investimento: "+ this.valorTotal+ "\n");
    }

}
