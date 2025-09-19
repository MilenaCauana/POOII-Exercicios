public class Gerente extends Funcionario implements Autenticavel{

    private String senha;
    private int numeroFuncionariosGerenciados;

    // ---- CONSTRUTORES ----
    public Gerente(){
        super();
    }

    public Gerente(String nome,String cpf,String endereco,double salario){
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

    //Implementando método da classe Interface
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
        return super.getSalario() * 0.15 + 1000.0;
    }
}
