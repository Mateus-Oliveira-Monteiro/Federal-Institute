package banco;

public class ContaCorrente extends Conta{
    @Override
    void atualiza(double taxa) {
        deposita(this.saldo * (taxa * 2));
    }
    @Override
    public void deposita(double quantidade) { //método
        this.saldo = (this.saldo + quantidade) - 1;
    }
}
