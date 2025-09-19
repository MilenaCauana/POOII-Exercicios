public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    // ---- CONSTRUTORES ----
    public Funcionario(){
        this.nome = "Nome não declarado.";
        this.cpf = "CPF não declarado.";
        this.endereco = "Endereço não declarado.";
        this.salario = 0.0;
    }

    public Funcionario(String nome,String cpf,String endereco,double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    // ---- GETTERS E SETTERS ----
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    //Classe abstrata
    public abstract double getBonificacao();

    //Classe para imprimir as informações
    public void imprimir(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nCPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("\nSalário: " + this.salario);
    }
}
