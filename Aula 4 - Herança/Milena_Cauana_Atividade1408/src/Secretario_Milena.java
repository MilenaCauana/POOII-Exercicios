public class Secretario_Milena extends Funcionario_Milena{
    private boolean chefSecretaria;

    // ---- CONSTRUTORES ----
    public Secretario_Milena(){
        super();
        this.chefSecretaria = false;
    }

    // ---- GETTERS E SETTERS ----
    public boolean getChefSecretaria(){
        return this.chefSecretaria;
    }

    public void setChefSecretaria (boolean chefSecretaria){
        this.chefSecretaria = chefSecretaria;
    }

    //Método para imprimir Secretário
    @Override
    public void imprimir(){
        super.imprimir();
        if (chefSecretaria){
            System.out.println("Chefe.");
        }
    }
}
