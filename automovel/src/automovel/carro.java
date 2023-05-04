/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovel;
public class carro extends veiculo {
 private int quantidadeDePortas;

public int getQuantidadeDePortas() {
	return quantidadeDePortas;
}

public void setQuantidadeDePortas(int quantidadeDePortas) {
	this.quantidadeDePortas = quantidadeDePortas;
}

public carro() {
	super();
}
public carro(int quantidadeDePortas, String modelo, String marca, int ano, double valor) {
super(modelo, marca, ano, valor);
this.quantidadeDePortas = quantidadeDePortas;
	// TODO Auto-generated constructor stub
}

    @Override
    public String imprimirInformacoes() {
        return "carro{" 
                + "quantidadeDePortas=" + quantidadeDePortas 
                + "modelo=" + super.getModelo()
                + "marca=" + super.getMarca()
                + "ano=" + super.getAno()
                + "valor" + super.getValor() +'}';
    }
 
}