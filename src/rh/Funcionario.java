package atividade2;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;

    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    // Metodo abstrato (cada tipo calcula de um jeito)
    public abstract double calcularPagamento();

    // Aumento geral em percentual (cada tipo aplica no seu rendimento base)
    public abstract void aplicarAumento(double percentual);

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Setor: " + setor);
    }

    // Getters (encapsulamento)
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public String getSetor() { return setor; }

    // Setters (se quiser permitir alteracao depois)
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setSetor(String setor) { this.setor = setor; }
}