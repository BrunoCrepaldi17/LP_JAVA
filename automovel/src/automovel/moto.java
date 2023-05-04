package automovel;
public class moto extends veiculo{
 private int cilindradas;

public int getCilindradas() {
	return cilindradas;
}

public void setCilindradas(int cilindradas) {
	this.cilindradas = cilindradas;
}

public moto(int cilindradas, String modelo, String marca, int ano, double valor) {
	super(modelo, marca, ano, valor);
 this.cilindradas = cilindradas;
	
}

    @Override
    public String imprimirInformacoes() {
        return "moto{" + "cilindradas=" + cilindradas
                + "modelo=" + super.getModelo()
                + "marca=" + super.getMarca()
                + "ano=" + super.getAno()
                + "valor" + super.getValor() +'}';
    }
}