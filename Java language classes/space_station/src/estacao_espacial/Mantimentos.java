package estacao_espacial;

public class Mantimentos {
    private String nome, descricao;
    private int quantidade;

    void mostraMantimentos(){
        System.out.println("############ Mantimentos ##############\n");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Descricao: "+ this.descricao);
        System.out.println("Quantidade: "+ this.quantidade+ "\n");

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
