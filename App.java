import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class App {
    private RH rh;
    private Scanner scanner;

    public App() {
        this.rh = new RH();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Estagiario");
            System.out.println("2. Adicionar Gerente");
            System.out.println("3. Mostrar Funcionários");
            System.out.println("4. Salvar Funcionários em arquivo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> adicionarDiretor();
                case 2 -> adicionarGerente();
                case 3 -> rh.mostrarFuncionarios();
                case 4 -> salvarFuncionariosEmArquivo();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

    private void adicionarDiretor() {
        System.out.print("Nome do estagiario: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do estagiario: ");
        int idade = scanner.nextInt();
        System.out.print("Salário: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();

        Estagiario diretor = new Estagiario(nome, idade, salarioBase);
        rh.adicionarFuncionario(diretor);
    }

    private void adicionarGerente() {
        System.out.print("Nome do Gerente: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do Gerente: ");
        int idade = scanner.nextInt();
        System.out.print("Salário: ");
        double salarioBase = scanner.nextDouble();
        

        Gerente gerente = new Gerente(nome, idade, salarioBase);
        rh.adicionarFuncionario(gerente);
    }

    private void salvarFuncionariosEmArquivo() {
    System.out.println("Salvando funcionários...");
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("funcionarios.txt"), "UTF-8"))) {
            for (Funcionario f : rh.getFuncionarios()) {
                writer.write(f.toString());
                writer.newLine();
            }
            System.out.println("Funcionários salvos em 'funcionarios.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar funcionários: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Erro ao salvar funcionários: " + e.getMessage());
    
    
        }
    }
}
