
package animais_polimorfismo;

public class Main {

    public static void main(String[] args) {
Cachorro meuCachorro = new Cachorro("Rex") { 
    @Override
    public void reagir() {
    }
    @Override
    public void emitirsom() {
    }
};
meuCachorro.reagir("O que é isso, Rex?");
meuCachorro.reagir("Não faça isso, Rex!");
meuCachorro.reagir(15, 30);
meuCachorro.reagir(20, 0);
meuCachorro.reagir(true);
meuCachorro.reagir(false);
meuCachorro.reagir(3, 8.0);
meuCachorro.reagir(3, 12.0);
meuCachorro.reagir(6, 8.0);
meuCachorro.reagir(6, 12.0);
  }
}
    

