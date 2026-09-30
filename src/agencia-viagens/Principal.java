package atividade1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CADASTRO DO PACOTE =====");

        System.out.print("Destino: ");
        String destino = sc.nextLine();

        System.out.print("Tipo de transporte: ");
        String tipoTransporte = sc.nextLine();

        System.out.print("Valor do transporte (em dolar): ");
        double valorTransporte = sc.nextDouble();

        sc.nextLine();

        System.out.print("Descricao da hospedagem: ");
        String descricaoHospedagem = sc.nextLine();

        System.out.print("Valor da diaria (em dolar): ");
        double valorDiaria = sc.nextDouble();

        System.out.print("Quantidade de dias: ");
        int dias = sc.nextInt();

        System.out.print("Margem de lucro (%): ");
        double margem = sc.nextDouble();

        System.out.print("Taxas adicionais (em dolar): ");
        double taxas = sc.nextDouble();

        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);
        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorDiaria);
        PacoteViagem pacote = new PacoteViagem(transporte, hospedagem, destino, dias);

        System.out.println("\n===== CADASTRO DA VENDA =====");

        sc.nextLine();

        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Forma de pagamento: ");
        String formaPagamento = sc.nextLine();

        System.out.print("Cotacao do dolar: ");
        double cotacao = sc.nextDouble();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacote);

        venda.mostrarResumoVenda(margem, taxas, cotacao);

        sc.close();
    }
}