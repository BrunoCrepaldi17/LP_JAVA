
package empresa;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salario, int id, String linguagem) {
        super(nome, salario, id);
        this.linguagem = linguagem;
    }

    public double calcularSalarioAnual() {
        return getSalario() * 12 * 1.2; // aumento de 20%
    }

    public String getLinguagem() {
        return linguagem;
    }
}
