/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o modelo do carro: ");
            String modelo = scanner.nextLine();

            System.out.print("Digite a marca do carro: ");
            String marca = scanner.nextLine();

            System.out.print("Digite o ano do carro: ");
            int ano = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite a potência do carro: ");
            double potencia = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite a cilindrada do motor: ");
            double cilindrada = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite o tipo de combustível do motor: ");
            String combustivel = scanner.nextLine();

            Carro carro = new Carro(modelo, marca, ano, potencia, cilindrada, combustivel);
            System.out.println(carro.toString());
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
