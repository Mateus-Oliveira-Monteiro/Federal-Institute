package banco;

public class ContaPoupanca extends Conta {
    @Override
    void atualiza(double taxa) {
        deposita(this.saldo * (taxa * 3));
    }
}
