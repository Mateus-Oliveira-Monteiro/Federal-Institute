package estacao_espacial;

public class Astronauta {
    private String nome, rg, especialidade;
    private int idade;
    private boolean ativo;

    public Astronauta(){
        Oxigenio.setConsumo(Oxigenio.getConsumo() + 50);
    }

    void mostraAstronauta(){
        System.out.println("############ Astronauta ##############\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("RG: " + this.rg);
        System.out.println("Idade: " + this.idade);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Ativo? : " + this.ativo + "\n");

    }


    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
