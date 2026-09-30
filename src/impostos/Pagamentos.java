package atividade3;

import java.util.ArrayList;

public class Pagamentos {

    private String nomeEmpresa;
    private ArrayList<Imposto> impostos;

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }

    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }

    public void mostrarImpostos() {
        System.out.println("\nEmpresa: " + nomeEmpresa);
        System.out.println("=== LISTA DE IMPOSTOS ===");

        for (Imposto i : impostos) {
            System.out.printf("%s - Valor: R$ %.2f%n",
                    i.getDescricao(),
                    i.calcularImposto());
        }
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
}