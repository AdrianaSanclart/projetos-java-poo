package atividade1;

public class PacoteViagem {

    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public double calcularTotalHospedagem() {
        return hospedagem.getValorDiaria() * quantidadeDias;
    }

    public double calcularLucro(double margemPercentual, double valor) {
        return valor + (valor * margemPercentual / 100);
    }

    public double calcularTotalPacote(double margemPercentual, double taxasAdicionais) {
        double totalBase = transporte.getValor() + calcularTotalHospedagem();
        double totalComLucro = calcularLucro(margemPercentual, totalBase);
        return totalComLucro + taxasAdicionais;
    }

    public String getDestino() {
        return destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }
}