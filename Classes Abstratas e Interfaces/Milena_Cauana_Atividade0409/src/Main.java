public class Main {
    public static void main(String[] args) {
        // Cria um empregado assalariado
        EmpSalario empregadoAssalariado = new EmpSalario("Joao", "Silva", 101, 3000.00);
        System.out.println("--- Dados do Empregado Assalariado ---");
        empregadoAssalariado.Imprimir();

        // Cria um empregado por hora
        EmprHora_Milena empregadoPorHora = new EmprHora_Milena("Maria", "Souza", 102, 25.0, 45);
        System.out.println("\n--- Dados do Empregado por Hora ---");
        empregadoPorHora.Imprimir();

        // Cria um empregado comissionado com salário base
        EmpComissaoBase_Milena empregadoComissao = new EmpComissaoBase_Milena("Carlos", "Gomes", 103, 10000.00, 0.15, 1500.00);
        System.out.println("\n--- Dados do Empregado Comissionado com Salário Base ---");
        empregadoComissao.Imprimir();
    }
}