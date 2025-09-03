public class Main {

    public static void main(String[] args) {

        // Criando um cliente para as contas
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        System.out.println("Cliente criado: " + cliente1.getNome() + ", CPF: " + cliente1.getCpf());
        System.out.println("----------------------------------------");

        //Testando a classe Conta
        System.out.println("Testando a classe Conta:");
        Conta conta = new Conta(1001, 500.0, 100.0, cliente1);
        System.out.println("Conta criada. Saldo inicial: R$" + conta.getSaldo());

        // Testando o método deposita()
        System.out.println("Depositando R$100.0...");
        conta.deposita(100.0);
        System.out.println("Novo saldo após depósito: R$" + conta.getSaldo());

        // Testando o método saque() - sucesso
        System.out.println("Tentando sacar R$200.0...");
        if (conta.saque(200.0)) {
            System.out.println("Saque bem-sucedido! Novo saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Saque falhou.");
        }

        // Testando o método saque() - falha (ultrapassa o limite)
        System.out.println("Tentando sacar R$1000.0 (deve falhar)...");
        if (conta.saque(1000.0)) {
            System.out.println("Saque bem-sucedido! Novo saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Saque falhou, saldo insuficiente.");
        }

        // Testando o método atualiza()
        System.out.println("Atualizando saldo com taxa de 10%...");
        conta.atualiza(0.10);
        System.out.println("Saldo após atualização: R$" + conta.getSaldo());
        System.out.println("----------------------------------------");

        // 2. Testando a classe ContaPoupanca
        System.out.println("Testando a classe ContaPoupanca:");
        ContaPoupanca contaPoupanca = new ContaPoupanca(2002, 500.0, 50.0, cliente1);
        System.out.println("Conta Poupança criada. Saldo inicial: R$" + contaPoupanca.getSaldo());

        // Testando o método atualiza() (sobrescrito)
        System.out.println("Atualizando saldo com taxa de 10% (deve triplicar o rendimento)...");
        contaPoupanca.atualiza(0.10);
        System.out.println("Saldo após atualização: R$" + contaPoupanca.getSaldo());
        System.out.println("----------------------------------------");

        // 3. Testando a classe ContaCorrente
        System.out.println("Testando a classe ContaCorrente:");
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumero(3003);
        contaCorrente.setTitular(cliente1);
        contaCorrente.setSaldo(500.0);
        contaCorrente.setLimite(200.0);
        System.out.println("Conta Corrente criada. Saldo inicial: R$" + contaCorrente.getSaldo());

        // Testando o método deposita() (sobrescrito)
        System.out.println("Depositando R$100.0 (com taxa de R$0.10)...");
        contaCorrente.deposita(100.0);
        System.out.println("Novo saldo após depósito: R$" + contaCorrente.getSaldo());

        // Testando o método atualiza() (sobrescrito)
        System.out.println("Atualizando saldo com taxa de 10% (deve duplicar a taxa)...");
        contaCorrente.atualiza(0.10);
        System.out.println("Saldo após atualização: R$" + contaCorrente.getSaldo());
        System.out.println("----------------------------------------");

    }
}