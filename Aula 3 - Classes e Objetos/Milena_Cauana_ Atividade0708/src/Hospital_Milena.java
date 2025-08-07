import java.util.ArrayList;

public class Hospital_Milena
{
    private String nome;
    private String endereco;
    private ArrayList<Medico_Milena> medicosContratados;

    // ---- CONSTRUTOR ----
    public Hospital_Milena(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.medicosContratados = new ArrayList<>();
    }

    // ---- GETTERS E SETTTERS ----
    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public ArrayList<Medico_Milena> getMedicosContratados(){
        return this.medicosContratados;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    //Método para adicionar medico
    public void adicionarMedico(Medico_Milena medico){
        this.medicosContratados.add(medico);
    }

    //Método para excluir um médico da lista
    public boolean excluirMedico(int crm){
        //Primeiro, veremos se há médicos na lista
        if (medicosContratados.isEmpty()){
            System.out.println("Não há médicos cadastrados.");
            return false;
        }
        //Agora, iremos percorrer a lista procurando o médico que será removido
        for (Medico_Milena medico : medicosContratados){
            if (medico.getCrm() == crm) {
                medicosContratados.remove(medico);
                return true; //Se encontrar, o médico será removido
            }
        }
        //Não encontrou o médico, logo, ele não foi removido
        System.out.println("CRM não encontrado.");
        return false;
    }

    //Método que recebe um ano e só exibe os médicos que foram adicionados desse ano em diante
    public void exibirMedicosAnoContrato(int ano){
        if (medicosContratados.isEmpty()){
            System.out.println("Não há medicos cadastrados.");
            return;
        }
        for (Medico_Milena medico : medicosContratados){
            if (medico.getDataContratacao().getYear() >= ano){
                medico.exibe();
            }
        }
    }

    //Imprimindo todos os hospitais presentes na lista do hospital
    public boolean imprime(){
        if (medicosContratados.isEmpty()){
            return false;
        }
            for (Medico_Milena medico : medicosContratados){
                medico.exibe();
            }
            return true;
    }
}
