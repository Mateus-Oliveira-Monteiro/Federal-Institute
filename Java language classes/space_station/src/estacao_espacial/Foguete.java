package estacao_espacial;

public class Foguete {
    private String nome, fabricante;
    private int qtdeTripulacao, qtdeCombustivel;

   void mostraFoguete(){
       System.out.println("############ Foguete ##############\n");
       System.out.println("Nome: " + this.nome);
       System.out.println("Fabricante: " + this.fabricante);
       System.out.println("Quantidade de Tripulacao: " + this.qtdeTripulacao);
       System.out.println("Quantidade de Combustível: " + this.qtdeCombustivel + "\n");
   }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQtdeTripulacao() {
        return qtdeTripulacao;
    }

    public void setQtdeTripulacao(int qtdeTripulacao) {
        this.qtdeTripulacao = qtdeTripulacao;
    }

    public int getQtdeCombustivel() {
        return qtdeCombustivel;
    }

    public void setQtdeCombustivel(int qtdeCombustivel) {
        this.qtdeCombustivel = qtdeCombustivel;
    }
}
