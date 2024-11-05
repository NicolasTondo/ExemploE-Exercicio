public abstract class Funcionario{
    private String nome;
    private int idade;
    private double salarioBase;

    public Funcionario(String nome, int idade, double salarioBase){
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }

    public double getSalarioBase(){
        return salarioBase;
    }
    
    public abstract double calcularSalario();

    public String toString() {
        return
        "\nStatus do funcionario: " +
        "\nNome: " + nome + 
        "\nIdade: " + idade;
    }
}