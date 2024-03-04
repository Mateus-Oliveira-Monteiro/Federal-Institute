package banco;

class Funcionario {
     private String nome, departamento, rg, dataDeEntrada;
     private double salario;
     private boolean ativo;


    void bonifica(double aumento){
        this.salario += aumento;
        System.out.println("O salario foi aumentado em: " + aumento);
    }

    void demite(){
        if(ativo){
            this.ativo = false;
            System.out.println("O funcionário foi demitido!");
        }else{
            System.out.println("O funcionario não está ativo!");
        }
    }

    void mostra(){
        System.out.println("Nome:"+ this.nome);
        System.out.println("Departamento:"+ this.departamento);
        System.out.println("RG:"+ this.rg);
        System.out.println("Data de entrada:"+ this.dataDeEntrada);
        System.out.println("Salario:"+ this.salario);
        System.out.println("Ativo:"+ this.ativo);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
