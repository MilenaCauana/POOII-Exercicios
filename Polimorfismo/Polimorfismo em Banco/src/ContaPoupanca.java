public class ContaPoupanca extends Conta{

    // ---- CONSTRUTORES ----
    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(int numero, double saldo, double limite, Cliente titular){
        super(numero, saldo, limite, titular);
    }

    @Override
    public void atualiza(double taxa){
        super.setSaldo(super.getSaldo() + super.getSaldo() * taxa * 3);
    }
}