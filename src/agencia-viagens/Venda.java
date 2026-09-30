package atividade1;

public class Venda {

    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacote;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacote) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }

    public double converterParaReais(double valorDolar, double cotacaoDolar) {
        return valorDolar * cotacaoDolar;
    }

    public void mostrarResumoVenda(double margem, double taxas, double cotacao) {
        double totalDolar = pacote.calcularTotalPacote(margem, taxas);
        double totalReais = converterParaReais(totalDolar, cotacao);

        System.out.println("\n===== RESUMO DA VENDA =====");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Destino: " + pacote.getDestino());
        System.out.println("Transporte: " + pacote.getTransporte().getTipo());
        System.out.println("Hospedagem: " + pacote.getHospedagem().getDescricao());
        System.out.println("Dias: " + pacote.getQuantidadeDias());
        System.out.println("Total em Dolar: $" + totalDolar);
        System.out.println("Total em Reais: R$" + totalReais);
    }
}