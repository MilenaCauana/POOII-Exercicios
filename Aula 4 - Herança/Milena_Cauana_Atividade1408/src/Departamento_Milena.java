import java.util.ArrayList;

public class Departamento_Milena {
    private String nome_dep;
    private String telefone_dep;
    private String email_dep;
    private ArrayList<Funcionario_Milena> funcionarios;


    // ---- CONSTRUTORES ----
    public Departamento_Milena (){
    }

    public Departamento_Milena (String nome_dep, String telefone_dep, String email_dep){
        this.nome_dep = nome_dep;
        this.telefone_dep = telefone_dep;
        this.email_dep = email_dep;
        this.funcionarios = new ArrayList<>();
    }

    // ---- GETTERS E SETTERS ----
    public String getNome_Dep(){
        return this.nome_dep;
    }

    public String getTelefone_dep(){
        return this.telefone_dep;
    }

    public String getEmail_dep(){
        return this.email_dep;
    }

    public ArrayList<Funcionario_Milena> getFuncionarios() {
        return funcionarios;
    }

    public void setNome_dep(String nome_dep){
        this.nome_dep = nome_dep;
    }

    public void setTelefone_dep(String telefone_dep){
        this.telefone_dep = telefone_dep;
    }

    public void setEmail_dep(String email_dep){
        this.email_dep = email_dep;
    }

    public void setFuncionarios(ArrayList<Funcionario_Milena> funcionarios) {
        this.funcionarios = funcionarios;
    }

    //Adicionando funcionario
    public void adicionarFuncionario(Funcionario_Milena funcionario){
        this.funcionarios.add(funcionario);
    }

    //Buscar funcionario
    public boolean buscarFuncionario(int matricula){
        if (funcionarios.isEmpty()){
            System.out.println("Nao ha funcionarios cadastrados.");
            return false;
        }

        for (Funcionario_Milena funcionario : funcionarios){
            if (funcionario.getMatricula() == matricula){
                funcionario.imprimir();
                return true;
            }
        }
        System.out.println("Funcionario nao encontrado.");
        return false;
    }

    //Excluindo funcionario
    public void excluirFuncionario(int matricula){
        if (funcionarios.isEmpty()){
            System.out.println("Nao ha funcionarios cadastrados.");
            return;
        }

        for (Funcionario_Milena funcionario : funcionarios){
            if (funcionario.getMatricula() == matricula){
                funcionarios.remove(funcionario);
                System.out.println("Funcionario excluido.");
                return;
            }
        }
        System.out.println("Funcionario nao encontrado.");
    }

    //Imprimindo
    public void imprimir(){
        System.out.println("Nome: "  + this.nome_dep);
        System.out.println("Telefone: " + this.telefone_dep);
        System.out.println("E-mail: " + this.email_dep);
        for (Funcionario_Milena funcionario : funcionarios){
            funcionario.imprimir();
        }
    }
}

