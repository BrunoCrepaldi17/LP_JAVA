/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais_polimorfismo;

/**
 *
 * @author aluno
 */
public abstract class Cachorro extends Mamifero {

    public Cachorro(String n) {
        super(n);
    }
    @Override
    public abstract void emitirsom();
    
    @Override
    public abstract void reagir();
    
public void reagir(String frase) {
    if (frase.toLowerCase().contains("!")) {
        System.out.println("Cachorro rosnando");
    } else {
        System.out.println("Cachorro abanando o rabo");
    }
}

public void reagir (int hora, int minuto) {
    if (hora < 12) {
        System.out.println("Cachorro abanando o rabo");
    } else if (hora < 18) {
        System.out.println("Cachorro latindo");
    } else {
        System.out.println("Cachorro ignorando");
    }
}

public void reagir (boolean estado) {
    if (estado) {
        System.out.println("Cachorro abanando o rabo");
    } else {
        System.out.println("Cachorro rosnando");
    }
}

public void reagir(int idade, double peso) {
    if (idade <= 5 && peso <= 10) {
        System.out.println("Cachorro abanando o rabo");
    } else if (idade <= 5 && peso > 10) {
        System.out.println("Cachorro latindo");
    } else if (idade > 5 && peso <= 10) {
        System.out.println("Cachorro rosnando");
    } else {
        System.out.println("Cachorro ignorando");
    }
}
}

