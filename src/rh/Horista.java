    package atividade2;

public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, String endereco, String telefone, String setor,
                   double horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void aplicarAumento(double percentual) {
        // Pode aplicar no valor da hora (mais realista)
        valorHora = valorHora + (valorHora * percentual / 100.0);
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Tipo: Horista%n");
        System.out.printf("Horas trabalhadas: %.2f%n", horasTrabalhadas);
        System.out.printf("Valor da hora: %.2f%n", valorHora);
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}