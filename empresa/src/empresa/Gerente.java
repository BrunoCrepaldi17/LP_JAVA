
package empresa;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, int id, String departamento) {
        super(nome, salario, id);
        this.departamento = departamento;
    }

    public double calcularSalarioAnual() {
        return getSalario() * 12 * 1.1; // aumento de 10%
    }

    public String getDepartamento() {
        return departamento;
    }
}
