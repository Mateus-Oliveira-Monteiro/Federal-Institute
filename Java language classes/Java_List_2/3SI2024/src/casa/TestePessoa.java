package casa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 =  new Pessoa();
        p1.setNome("Mateus");
        p1.setIdade(19);
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        p1.fazAniversario();
    }
}
