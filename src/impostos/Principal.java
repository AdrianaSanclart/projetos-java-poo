package atividade3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da empresa: ");
        String nomeEmpresa = sc.nextLine();

        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);

        while (true) {

            System.out.println("\nDigite o tipo de imposto (PIS / IPI) ou 'pare' para encerrar:");
            String tipo = sc.nextLine().toUpperCase();

            if (tipo.equals("PARE")) {
                break;
            }

            if (tipo.equals("PIS")) {

                System.out.print("Valor total de debito: ");
                double debito = Double.parseDouble(sc.nextLine());

                System.out.print("Valor total de credito: ");
                double credito = Double.parseDouble(sc.nextLine());

                pagamentos.adicionarImposto(new PIS(debito, credito));

            } else if (tipo.equals("IPI")) {

                System.out.print("Valor do produto: ");
                double valor = Double.parseDouble(sc.nextLine());

                System.out.print("Frete: ");
                double frete = Double.parseDouble(sc.nextLine());

                System.out.print("Seguro: ");
                double seguro = Double.parseDouble(sc.nextLine());

                System.out.print("Outras despesas: ");
                double outras = Double.parseDouble(sc.nextLine());

                System.out.print("Aliquota (%): ");
                double aliquota = Double.parseDouble(sc.nextLine());

                pagamentos.adicionarImposto(new IPI(valor, frete, seguro, outras, aliquota));

            } else {
                System.out.println("Tipo invalido.");
            }
        }

        pagamentos.mostrarImpostos();

        sc.close();
    }
}