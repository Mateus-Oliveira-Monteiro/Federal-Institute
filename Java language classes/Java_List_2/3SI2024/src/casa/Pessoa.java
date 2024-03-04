package casa;

class Pessoa {
    private String nome;
    private int idade;

    void fazAniversario(){
        this.idade += 1;
        System.out.println("O " + this.nome + " fez " + this.idade + " anos ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
