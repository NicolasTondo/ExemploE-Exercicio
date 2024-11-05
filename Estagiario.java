public class Estagiario extends Funcionario{

    public Estagiario(String nome, int idade, double salarioBase) {
        super(nome, idade, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 0.8;
    }

    @Override
    public String toString() {
        return 
        super.toString() +
        "\nSalário: " + calcularSalario();
    }
}


