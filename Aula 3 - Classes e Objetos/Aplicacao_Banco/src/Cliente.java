public class Cliente {
    private String nome;
    private String sobrenome;
    private String endereco;
    private String cpf;

    // ---- CONSTRUTORES ----
    //Não farei construtor sem parâmetro, pois, para o sistema ser mais robusto, eu não posso ter uma conta sem informações.

    public Cliente (String nome, String sobrenome, String endereco, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    // ---- GETTERS E SETTERS ----
    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
