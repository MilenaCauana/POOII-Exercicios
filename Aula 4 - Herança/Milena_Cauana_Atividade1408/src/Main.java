import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Criação de objetos da classe Funcionario_Milena, Professor_Milena e Secretario_Milena
        Funcionario_Milena funcionario1 = new Funcionario_Milena(101, "Ana Silva", "9999-8888", "ana.silva@empresa.com", 3500.00);
        Professor_Milena professor1 = new Professor_Milena(201, "Carlos Mendes", "9888-7777", "carlos.mendes@escola.com", 6000.00, "Doutorado", 5, "http://lattes.cnpq.br/carlos");
        Secretario_Milena secretario1 = new Secretario_Milena();
        secretario1.setMatricula(301);
        secretario1.setNome("Beatriz Costa");
        secretario1.setTelefone("9777-6666");
        secretario1.setEmail("beatriz.costa@empresa.com");
        secretario1.setSalario(4000.00);
        secretario1.setChefSecretaria(true);

        // Criação de um objeto da classe Departamento_Milena
        Departamento_Milena departamento = new Departamento_Milena("Departamento de TI", "9666-5555", "ti@empresa.com");

        // Adicionando os funcionários ao departamento
        departamento.adicionarFuncionario(funcionario1);
        departamento.adicionarFuncionario(professor1);
        departamento.adicionarFuncionario(secretario1);

        // Imprimindo as informações do departamento e de seus funcionários
        System.out.println("--- Informações do Departamento ---");
        departamento.imprimir();

        // Buscando e imprimindo as informações de um funcionário pela matrícula
        System.out.println("\n--- Buscando funcionário com matrícula 201 ---");
        departamento.buscarFuncionario(201);

        // Tentando buscar um funcionário que não existe
        System.out.println("\n--- Tentando buscar funcionário com matrícula 999 ---");
        departamento.buscarFuncionario(999);

        // Excluindo um funcionário
        System.out.println("\n--- Excluindo funcionário com matrícula 101 ---");
        departamento.excluirFuncionario(101);

        // Imprimindo novamente o departamento para verificar a exclusão
        System.out.println("\n--- Informações do Departamento após a exclusão ---");
        departamento.imprimir();

        // Tentando excluir o mesmo funcionário novamente
        System.out.println("\n--- Tentando excluir novamente o funcionário 101 ---");
        departamento.excluirFuncionario(101);

    }
}