 public class Conta {

    private int numero;
    private double saldo;
    private double limite;
    private Cliente titular;

    // ---- COSTRUTORES ----
    public Conta(){
    }

    public Conta (int numero, double saldo, double limite, Cliente titular){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.titular = titular;
    }

    //GETTERS e SETTERS
    public int getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(){
        return this.limite;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setNumero (int numero){
        this.numero = numero;
    }

    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public void setLimite (double limite){
        this.limite = limite;
    }

    public void setTitular (Cliente titular){
        this.titular = titular;
    }

    //Método para ir atualizando o valor do saldo de acordo com a taxa de rendimento
    public void atualiza (double taxa){
        this.saldo += this.saldo * taxa;
    }

    //Método para depositar
    public void deposita (double valor){
        this.saldo += this.saldo + valor;
    }

    //Método de saque
    public boolean saque (double valor){
        if (this.saldo - valor >= - this.limite){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
