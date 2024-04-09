package estacao_espacial;

public class Controlador extends Pessoa{
    private String funcao;
    private double salario;

    void mostraControlador(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("RG: " + this.getRg() );
        System.out.println("Data Nascimento: " + this.getDataNasc());
        System.out.println("Especialidade: " + this.funcao);
        System.out.println("Ativo: " + this.salario);
    }
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
