package estacao_espacial;

public class Modulo {
    private String nome, utilidade;
    private double tamanho;


    void mostraModulo(){
        System.out.println("############ Modulo ##############\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Utilidade: " + this.utilidade);
        System.out.println("Tamanho: " + this.tamanho+ "\n");

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUtilidade() {
        return utilidade;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
