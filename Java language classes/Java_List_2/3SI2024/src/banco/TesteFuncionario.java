package banco;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Fiodor");
        f1.setSalario(1500);
        f1.setRg("52062132840");
        f1.setDataDeEntrada("21/09/2004");
        f1.setDepartamento("TI");
        f1.setAtivo(true);
        f1.bonifica(300);
        f1.mostra();
        f1.demite();
        f1.mostra();
    }
}
