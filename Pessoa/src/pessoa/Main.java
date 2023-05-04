package pessoa;

public class Main {

    public static void main(String[] args) {
        Apresentar pessoa = new Apresentar("bruno", 22) {
            @Override
            public void apresentar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        pessoa.apresentar("Batata", 19);
        pessoa.apresentar("Du", 14);
        pessoa.apresentar("Vó", 65);
        pessoa.apresentar("Pai", 0);
        pessoa.apresentar("Bruno", "Crepaldi", 0);
    }

}
