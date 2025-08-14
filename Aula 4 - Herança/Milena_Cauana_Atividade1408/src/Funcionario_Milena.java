public class Funcionario_Milena
{
    private int matricula;
    private String nome;
    private String telefone;
    private String email;
    private double salario;

    // ---- CONSTRUTORES ----
    public Funcionario_Milena (){
        this.matricula = 0;
        this.nome = "Nome nao fornecido";
        this.telefone = "Telefone nao fornecido";
        this.email = "Email nao fornecido";
        this.salario = 0.0;
    }

    public Funcionario_Milena (int matricula, String nome, String telefone, String email, double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
    }

    // ---- GETTERS E SETTERS ----
    public int getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getEmail(){
        return this.email;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setMatricula (int matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone (String telefone){
        this.telefone = telefone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSalario (double salario){
        this.salario = salario;
    }

    //Método que imprime todas as informações
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("E-mail: " + this.email);
        System.out.println("Salario: " + this.salario);
    }
}