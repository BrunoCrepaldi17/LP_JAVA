package pessoa;

public abstract class Apresentar extends Pessoa {
    
    public Apresentar(String nome, int idade) {
        super(nome, idade);
    }
    @Override
     public abstract void apresentar();
     
     public void apresentar (String nome, int idade) {
    if (idade <= 18) {
        System.out.println("Oi "+ nome);
    } else if (idade > 18 && idade < 60) {
        System.out.println("Olá "+ nome);
    } else if (idade >= 60){
         System.out.println("Tudo bem? "+nome);    
     } if (idade == 0){
         System.out.println("meu nome é: "+nome);
    }
 }
public void apresentar (String nome, String sobrenome, int idade) {
        if (idade == 0){
         System.out.println("meu nome é: "+nome +" "+ sobrenome);
    } 
 }

} 


