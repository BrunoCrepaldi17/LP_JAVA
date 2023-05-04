/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais_polimorfismo;

/**
 *
 * @author aluno
 */
public abstract class Mamifero extends Animais {

    public Mamifero(String n) {
        super(n);
    }
    public abstract void reagir();
    public abstract void emitirsom();
}
