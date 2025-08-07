import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Hospital_Milena hospital = new Hospital_Milena("Hospital Santa Milena", "Rua Corridinha, 24 - CEP: 1508-24");

        System.out.println("================");
        System.out.println("Bem-Vindo ao " + hospital.getNome() + "!");
        System.out.println("Endereço: " + hospital.getEndereco());

        //Agora, irei criar um sistema que será um menu, que poderá adicionar adicionar medicos ao hospital, remover, visualiza-los, etc
        int x;
        do{
            System.out.println("\n===================================== ");
            System.out.println("Escolha uma opção:");
            System.out.println("1) Adicionar Médico;");
            System.out.println("2) Excluir Médico pelo CRM;");
            System.out.println("3) Exibir Médico a partir de um ano;");
            System.out.println("4) Exibir todos os médicos;");
            System.out.println("7) Sair;");

            x = sc.nextInt();
            sc.nextLine();

            switch(x)
            {
                case 1:
                    Medico_Milena medico = new Medico_Milena();
                    System.out.println("\n======= ADICIONAR MEDICO ========");
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    medico.setNome(nome);
                    System.out.println("CRM: ");
                    int crm = sc.nextInt();
                    sc.nextLine();
                    medico.setCrm(crm);

                    int especialidade;
                    do {
                        System.out.println("\nEscolha ume especialidade: ");
                        System.out.println("1- Pediatra;");
                        System.out.println("2- Dermatologista.\n");
                        especialidade = sc.nextInt();
                        sc.nextLine();

                        if (especialidade == 1)
                        {
                            medico.setEspecialidade("Pediatra");
                        }
                        if (especialidade == 2){
                            medico.setEspecialidade("Dermatologista");
                        }
                    }while (especialidade != 1 && especialidade != 2);

                    System.out.println("Salario: ");
                    float salario = sc.nextFloat();
                    medico.setSalario(salario);
                    sc.nextLine();

                    hospital.adicionarMedico(medico);
                    break;

                case 2:
                    System.out.println("\n===== EXCLUIR MEDICO =====");
                    boolean medicoEncontrado;
                    do {
                        System.out.println("Informe o CRM: ");
                        crm = sc.nextInt();
                        sc.nextLine();
                        medicoEncontrado = hospital.excluirMedico(crm);
                        if (medicoEncontrado){
                            System.out.println("Médico excluido com sucesso.");
                        } else{
                            System.out.println("Médico não encontrado");
                            System.out.println("Deseja ternar novamente? ");
                            System.out.println("1) Sim;");
                            System.out.println("2) Não;");

                            int z = sc.nextInt();
                            sc.nextLine();
                            if (z == 2){
                                medicoEncontrado = true;
                            }
                        }
                    }while(!medicoEncontrado);

                    break;

                case 3:
                    System.out.println("Ano:");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\n======= RELATÓRIO A PARTIR DE " + ano + " ==========");
                    hospital.exibirMedicosAnoContrato(ano);
                    break;

                case 4:
                    if (!hospital.imprime()){
                        System.out.println("Não há médicos cadastrados");
                    }
                    break;

                case 7:
                    System.out.println("Obrigada!");
            }

        } while (x != 7);
    }
}