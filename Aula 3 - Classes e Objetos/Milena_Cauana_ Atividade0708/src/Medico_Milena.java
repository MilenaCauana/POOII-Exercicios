import java.time.LocalDate;

public class Medico_Milena
{
    private int crm;
    private String nome;
    private String especialidade;
    private LocalDate dataContratacao;
    private float salario;

    // ---- CONSTRUTORES ----
    public Medico_Milena(){
        this.crm = 0;
        this.nome = "Nome não declarado";
        this.especialidade = "Especialidade não declarada";
        this.dataContratacao = LocalDate.now();
        this.salario = 0;
    }

    public Medico_Milena(int crm, String nome, String especialidade, float salarío){
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.dataContratacao = LocalDate.now();
        this.salario = salario;
    }

    // ---- GETTERS E SETTERS ----
    public int getCrm(){
        return this.crm;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public LocalDate getDataContratacao(){
        return this.dataContratacao;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setCrm(int crm){
        this.crm = crm;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public void setDataContratacao (){
        this.dataContratacao = LocalDate.now();
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    //Exibindo as informações do médico
    public void exibe(){
        System.out.println(" ----------------- ");
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Data de contratacao: " +dataContratacao);
        System.out.println("Salario: " + salario);
    }
}
