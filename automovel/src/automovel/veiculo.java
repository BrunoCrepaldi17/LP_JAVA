
package automovel;


public class veiculo {
private String modelo;
private String marca;
private int ano;
private double valor;



/**
 * @param modelo
 * @param marca
 * @param ano
 * @param valor
 */
public veiculo(String modelo, String marca, int ano, double valor) {
	super();
	this.modelo = modelo;
	this.marca = marca;
	this.ano = ano;
	this.valor = valor;
}

/**
 * 
 */
public veiculo() {
	super();
	// TODO Auto-generated constructor stub
}


public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}

    public String imprimirInformacoes() {
      return null;
    }


}


