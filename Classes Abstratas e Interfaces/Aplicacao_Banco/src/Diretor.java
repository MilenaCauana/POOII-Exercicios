public class Diretor extends Funcionario{
    private String senha;

    // ---- CONSTRUTORES ----
    public Diretor(){
        super();
    }

    public Diretor(String nome,String cpf,String endereco,double salario){
        super(nome, cpf, endereco, salario);
    }

    // ---- GETTERS E SETTERS ----
    public String getNome(){
        return super.getNome();
    }

    public String getCpf(){
        return super.getCpf();
    }

    public String getEndereco(){
        return super.getEndereco();
    }

    public double getSalario(){
        return super.getSalario();
    }

    public void setNome(String nome){
        super.setNome(nome);
    }

    public void setCpf(String cpf){
        super.setCpf(cpf);
    }

    public void setEndereco(String endereco){
        super.setEndereco(endereco);
    }

    public void setSalario(double salario){
        super.setSalario(salario);
    }

    //Implementação do método da classe Interface
    public boolean autentica(String senha){
        if (this.senha.equals(senha)){
            System.out.println("Acesso Permitido!");
            return true;
        }
        System.out.println("Acesso Negado!");
        return false;
    }

    //Implementação do método da classe Abstrata
    public double getBonificacao(){
        return super.getSalario() * 0.20 +2000.0;
    }
}
