package animais_polimorfismo;

public abstract class Animais {
protected String nome;

    public Animais(String n) {
        nome = n;
    }
public void imp(){
    System.out.println("Nome: "+ nome);
}

    public String getNome() {
        return (this.nome);
    }
public abstract void emitirsom();
    public abstract void reagir();
}
