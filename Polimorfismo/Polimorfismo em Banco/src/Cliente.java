public class Cliente {
    private String nome;
    private String cpf;

    // ---- CONSTRUTORES ----
    public Cliente (){
        this.nome = "Nome não declarado";
        this.cpf = "CPF não informado.";
    }

    public Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    // ---- SETTERS E GETTERS ----
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }


}
