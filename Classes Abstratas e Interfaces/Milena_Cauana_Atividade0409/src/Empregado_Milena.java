public abstract class Empregado_Milena implements IGanhos_Imprimir_Milnena{
    private String nome;
    private String sobrenome;
    private int matricula;

    // ---- CONSTRUTORES ----
    public Empregado_Milena(){
        this.nome = "Nome não fornecido.";
        this.sobrenome = "Sobrenome não fornecido.";
        this.matricula = 0;
    }

    public Empregado_Milena(String nome, String sobrenome, int matricula){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    // ---- GETTERS E SETTERS ----
    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    //Métodos abstratos da interface
    //Como Ganhos() tem regras diferentes para cada classe fliha, irei sobresrecever aqui
    @Override
    public abstract double Ganhos();

    //Agora, irei implementar a classe Imprimir
    public void Imprimir(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nSobrenome: " + this.sobrenome);
        System.out.println("\nMatricula: " + this.matricula);
    }
}
