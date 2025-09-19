public class Main {
    public static void main(String[] args) {

        System.out.println("--- Criando e interagindo com um Diretor ---");
        // Cria um objeto Diretor usando o construtor com parâmetros.
        Diretor diretor = new Diretor("Maria Santos", "987.654.321-00", "Rua A, 123", 15000.00);

        // Define a senha do diretor (necessário para a autenticação).
        diretor.setSenha("senha123");

        // Exibe as informações do diretor.
        diretor.imprimir();

        // Calcula e exibe a bonificação do diretor.
        System.out.println("Bonificação: R$" + diretor.getBonificacao());

        // Testa a autenticação do diretor.
        System.out.println("\nTentando autenticar o Diretor com a senha correta:");
        diretor.autentica("senha123");

        System.out.println("\nTentando autenticar o Diretor com a senha incorreta:");
        diretor.autentica("senhaerrada");

        System.out.println("\n" + "-".repeat(40) + "\n");

        System.out.println("--- Criando e interagindo com um Gerente ---");
        // Cria um objeto Gerente usando o construtor com parâmetros.
        Gerente gerente = new Gerente("João da Silva", "123.456.789-00", "Av. B, 456", 8000.00);

        // Define a senha e o número de funcionários gerenciados.
        gerente.setSenha("senha456");
        gerente.setNumeroFuncionariosGerenciados(15);

        // Exibe as informações do gerente.
        gerente.imprimir();

        // Calcula e exibe a bonificação do gerente.
        System.out.println("Bonificação: R$" + gerente.getBonificacao());

        // Testa a autenticação do gerente.
        System.out.println("\nTentando autenticar o Gerente com a senha correta:");
        gerente.autentica("senha456");

        System.out.println("\nTentando autenticar o Gerente com a senha incorreta:");
        gerente.autentica("senhaerrada");
    }
}