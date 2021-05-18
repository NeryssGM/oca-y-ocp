/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Additional;

/**
 *
 * @author HUGO
 */

// Esta es una clase abstracta, esto genera que algunos metodos al heredar la clase, sean obligatorios para
// implementar en la clase.
public abstract class P057Cat {
    //Metodo obligatoria al heredar, metodo abstracto.
    public abstract void clean();
    
    //Metodo opcional se puede o no sobre-escribir.
    public void sleep(){
        System.out.println("The cat is sleep.");
    }
}
