import java.util.List;
import java.util.ArrayList;

public class RH {
    private List<Funcionario>funcionarios;

    public RH() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    
    public void removerFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public void mostrarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
