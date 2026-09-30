package atividade2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Ajuda com ponto/virgula em double (se preferir virgula, remova isso)
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("=== CADASTRO DE FUNCIONARIOS (max 10) ===");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nCadastrar funcionario " + (i + 1) + "? (S/N)");
            String resp = sc.nextLine().trim().toUpperCase();
            if (!resp.equals("S")) break;

            System.out.println("Tipo (1 = Assalariado, 2 = Horista): ");
            int tipo = lerInt(sc);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            System.out.print("Endereco: ");
            String endereco = sc.nextLine();

            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            System.out.print("Setor: ");
            String setor = sc.nextLine();

            if (tipo == 1) {
                System.out.print("Salario mensal: ");
                double salario = lerDouble(sc);

                Funcionario f = new Assalariado(nome, cpf, endereco, telefone, setor, salario);
                funcionarios.add(f);

            } else if (tipo == 2) {
                System.out.print("Horas trabalhadas: ");
                double horas = lerDouble(sc);

                System.out.print("Valor da hora: ");
                double valorHora = lerDouble(sc);

                Funcionario f = new Horista(nome, cpf, endereco, telefone, setor, horas, valorHora);
                funcionarios.add(f);

            } else {
                System.out.println("Tipo invalido. Funcionario nao cadastrado.");
                i--; // repete esta posicao
            }
        }

        // Mostrar dados e pagamento de cada funcionario
        System.out.println("\n=== LISTA DE FUNCIONARIOS E PAGAMENTOS ===");
        mostrarFuncionarios(funcionarios);

        // Aplicar aumento geral
        if (!funcionarios.isEmpty()) {
            System.out.print("\nInforme o aumento geral (%) para todos: ");
            double aumento = lerDouble(sc);

            for (Funcionario f : funcionarios) {
                f.aplicarAumento(aumento); // polimorfismo
            }

            System.out.println("\n=== PAGAMENTOS APOS AUMENTO ===");
            mostrarPagamentos(funcionarios);
        } else {
            System.out.println("\nNenhum funcionario cadastrado.");
        }

        sc.close();
    }

    private static void mostrarFuncionarios(ArrayList<Funcionario> funcionarios) {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            System.out.println("\nFuncionario #" + (i + 1));
            f.mostrarDados();
            System.out.printf("Pagamento: %.2f%n", f.calcularPagamento());
        }
    }

    private static void mostrarPagamentos(ArrayList<Funcionario> funcionarios) {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            System.out.printf("Funcionario #%d (%s) - Pagamento: %.2f%n",
                    (i + 1), f.getNome(), f.calcularPagamento());
        }
    }

    private static int lerInt(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine().trim();
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.print("Digite um numero inteiro valido: ");
            }
        }
    }

    private static double lerDouble(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine().trim().replace(",", ".");
                return Double.parseDouble(s);
            } catch (Exception e) {
                System.out.print("Digite um numero valido (ex: 10.5): ");
            }
        }
    }
}