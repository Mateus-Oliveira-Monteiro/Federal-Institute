package estacao_espacial;

public class Astronauta extends Pessoa implements Relatorio {
    private String especialidade;
    private boolean ativo;

    public Astronauta(){
        Oxigenio.setConsumo(Oxigenio.getConsumo() + 50);
    }

    void mostraAstronauta(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("RG: " + this.getRg() );
        System.out.println("Data Nascimento: " + this.getDataNasc());
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Ativo: " + this.ativo);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    @Override
    public void fazerRelatorio(int qtdLinhas) throws RelatorioException {
        if (qtdLinhas <= 0) {
            throw new RelatorioException("Quantidade de linhas não pode ser negativa.");
        }
        System.out.println("Fazendo relatório de: " + qtdLinhas + " Linhas");
    }
}
