public abstract class EmpComissao_Milena extends Empregado_Milena{
    private double valorVendido;
    private double taxaComissao;

    // ---- CONSTRUTORES ----
    public EmpComissao_Milena(){
    }

    public EmpComissao_Milena(String nome, String sobrenome, int matricula, double salarioMensal, double valorVendido, double taxaComissao){
        super(nome, sobrenome, matricula);
        this.valorVendido = valorVendido;
        this.taxaComissao = taxaComissao;
    }

    // ---- GET ----
    public double getValorVendido(){
        return this.valorVendido;
    }

    public double getTaxaComissao(){
        return this.taxaComissao;
    }

    //MÉTODOS
    public double Ganhos(){
        return valorVendido * taxaComissao;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Valor Vendido: " + valorVendido);
        System.out.println("Taxa Comissão: " + taxaComissao);
    }

    public abstract void imprimir();
}
