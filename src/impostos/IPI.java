package atividade3;

public class IPI implements Imposto {

    private double valorProduto;
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;

    public IPI(double valorProduto, double frete, double seguro, double outrasDespesas, double aliquota) {
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }

    @Override
    public double calcularImposto() {
        double base = valorProduto + frete + seguro + outrasDespesas;
        return base * (aliquota / 100.0);
    }

    @Override
    public String getDescricao() {
        return "IPI";
    }

    // Getters e Setters
    public double getValorProduto() { return valorProduto; }
    public void setValorProduto(double valorProduto) { this.valorProduto = valorProduto; }

    public double getFrete() { return frete; }
    public void setFrete(double frete) { this.frete = frete; }

    public double getSeguro() { return seguro; }
    public void setSeguro(double seguro) { this.seguro = seguro; }

    public double getOutrasDespesas() { return outrasDespesas; }
    public void setOutrasDespesas(double outrasDespesas) { this.outrasDespesas = outrasDespesas; }

    public double getAliquota() { return aliquota; }
    public void setAliquota(double aliquota) { this.aliquota = aliquota; }
}