public class ContaCorrente extends Conta{

    @Override
    public void atualiza(double taxa){
        super.setSaldo(super.getSaldo() + taxa * 2);
    }

    @Override
    public void deposita(double valor){
        super.setSaldo(super.getSaldo() + valor - 0.1);
    }
}
