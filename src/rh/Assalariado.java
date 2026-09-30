package atividade2;

public class Assalariado extends Funcionario {
    private double salarioMensal;

    public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, double salarioMensal) {
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }

    @Override
    public void aplicarAumento(double percentual) {
        salarioMensal = salarioMensal + (salarioMensal * percentual / 100.0);
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Tipo: Assalariado%n");
        System.out.printf("Salario mensal: %.2f%n", salarioMensal);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}