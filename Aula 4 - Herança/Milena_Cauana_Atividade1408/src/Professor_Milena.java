public class Professor_Milena extends Funcionario_Milena{
    private String titulacao;
    private int qtdPublicacao;
    private String linkCurriculo;

    // ---- CONSTRUTORES ----
    public Professor_Milena(){
        super();
        this.titulacao = "Titulacao nao informada.";
        this.qtdPublicacao = 0;
        this.linkCurriculo = "Link nao informado.";
    }

    public Professor_Milena(int matricula, String nome, String telefone, String email, double salario, String titulacao, int qtdPublicacao, String linkCurriculo){
        super(matricula, nome, telefone, email, salario);
        this.titulacao = titulacao;
        this.qtdPublicacao = qtdPublicacao;
        this.linkCurriculo = linkCurriculo;
    }

    // ---- GETTERS E SETTERS ----
    public String getTitulacao(){
        return this.titulacao;
    }

    public int getQtdPublicacao(){
        return this.qtdPublicacao;
    }

    public String getLinkCurriculo(){
        return this.linkCurriculo;
    }

    public void setTitulacao (String titulacao){
        this.titulacao = titulacao;
    }

    public void setQtdPublicacao (int qtdPublicacao){
        this.qtdPublicacao = qtdPublicacao;
    }

    public void setLinkCurriculo (String linkCurriculo){
        this.linkCurriculo = linkCurriculo;
    }

    //Método para imprimir informaçoões
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Titulacao: " + titulacao);
        System.out.println("Quantidade de Publicacoes: " + qtdPublicacao);
        System.out.println("Link do Curriculo: " + linkCurriculo);
    }

}
