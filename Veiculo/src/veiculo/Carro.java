/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double potencia;
    private Motor motor;

    public Carro(String modelo, String marca, int ano, double potencia, double cilindrada, String combustivel) {
        if (ano <= 1900) {
            throw new IllegalArgumentException("Ano inválido");
        }
        if (potencia <= 0) {
            throw new IllegalArgumentException("Potência inválida");
        }
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.motor = new Motor(cilindrada, combustivel);
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", potencia=" + potencia +
                ", motor=" + motor +
                '}';
    }
}





