package estacao_espacial;

public class Missao {
    private String nome, descricao;
    private double duracao;

    Astronauta astro;
    Foguete foguete;
    Investimento invest;

    void mostraMissao(){
        System.out.println("############ Missão ##############\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Duracao: " + this.duracao);
        System.out.println("Astronauta: " + this.astro.getNome());
        System.out.println("Foguete: " + this.foguete.getNome());
        System.out.println("Investimento: " + this.invest.getValorTotal()+ "\n");
    }


    public Foguete getFoguete() {
        return foguete;
    }

    public void setFoguete(Foguete foguete) {
        this.foguete = foguete;
    }

    public Investimento getInvest() {
        return invest;
    }

    public void setInvest(Investimento invest) {
        this.invest = invest;
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

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public Astronauta getAstro() {
        return astro;
    }

    public void setAstro(Astronauta astro) {
        this.astro = astro;
    }
}
