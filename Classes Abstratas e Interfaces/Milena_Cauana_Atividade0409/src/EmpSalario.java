public class EmpSalario extends Empregado_Milena{

    private double salarioMensal;

    // ---- CONSTRUTOR ----
    public EmpSalario(){
        super();
        salarioMensal = 0.0;
    }

    public EmpSalario(String nome, String sobrenome, int matricula, double salarioMensal){
        super(nome, sobrenome, matricula);
        this.salarioMensal = salarioMensal;
    }

    // ---- SETTERS ----
    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }

    //Método do ganho
    public double Ganhos(){
        return this.salarioMensal;
    }
}
