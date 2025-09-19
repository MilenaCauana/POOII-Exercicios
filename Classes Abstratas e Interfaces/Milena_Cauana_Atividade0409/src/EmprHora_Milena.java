public class EmprHora_Milena extends Empregado_Milena {
    private double ganhoPorHora;
    private int horasTrabalhadas;

    // ---- CONSTRUTORES ----
    public EmprHora_Milena() {
        super();
        this.ganhoPorHora = 0;
        this.horasTrabalhadas = 0;
    }

    public EmprHora_Milena(String nome, String sobrenome, int matricula, double salarioMensal, double ganhoPorHora, int horasTrabalhadas) {
        super(nome, sobrenome, matricula);
        this.ganhoPorHora = ganhoPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //MÉTODOS
    public double Ganhos() {
        if (horasTrabalhadas <= 40) {
            return ganhoPorHora * horasTrabalhadas;
        } else {
            return (40 * ganhoPorHora) + ((horasTrabalhadas - 40) * ganhoPorHora * 1.5);
        }
    }

@Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Ganho por hora: " + ganhoPorHora);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
}
}