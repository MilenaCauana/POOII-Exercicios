public class EmpComissaoBase_Milena extends EmpComissao_Milena{
    private double salarioBase;

    // ---- CONSTRUTORES -----
    public EmpComissaoBase_Milena(){

    }

    //MÉTODOS
    public double Ganhos(){
        return salarioBase + (getValorVendido() * getTaxaComissao());
    }

    @Override
    public void imprimir(){
        super.Imprimir();
        System.out.println("Salário Base: " + salarioBase);
    }
}
