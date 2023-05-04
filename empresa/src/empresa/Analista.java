/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author bcrep
 */
public class Analista extends Funcionario {
    private String tipoAnalise;

    public Analista(String nome, double salario, int id, String tipoAnalise) {
        super(nome, salario, id);
        this.tipoAnalise = tipoAnalise;
    }

    public double calcularSalarioAnual() {
        return getSalario() * 12 + 500; // bônus de 500 reais
    }

    public String getTipoAnalise() {
        return tipoAnalise;
    }
}
