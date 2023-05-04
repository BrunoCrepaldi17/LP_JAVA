/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;
class Motor {
    private double cilindrada;
    private String combustivel;

    public Motor(double cilindrada, String combustivel) {
        if (cilindrada <= 0) {
            throw new IllegalArgumentException("Cilindrada inválida");
        }
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindrada=" + cilindrada +
                ", combustivel='" + combustivel + '\'' +
                '}';
    }
}
