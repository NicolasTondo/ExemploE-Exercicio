public class Gerente extends Funcionario{
    private static final int COMISSAO = 2000;

    public Gerente(String nome, int idade, double salarioBase) {
        super(nome, idade, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + COMISSAO;
    }

    @Override
    public String toString() {
        return 
        super.toString() +
        "\nComissão: " + COMISSAO +
        "\nSalário Gerente: " + calcularSalario();
    }
}

