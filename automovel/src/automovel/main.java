/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovel;

public class main {

    public static void main(String[] args) {
      veiculo moto = new moto(250,"fan","honda",2001, 15000);
      veiculo carro = new carro(4,"gol","wolks",2023,30000);
      
        System.out.println(moto.imprimirInformacoes());
            System.out.println(carro.imprimirInformacoes());
    }
    
}
