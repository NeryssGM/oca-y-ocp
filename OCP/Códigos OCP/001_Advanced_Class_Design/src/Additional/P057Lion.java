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
public class P057Lion extends P057Cat {

    //Metodo obligatorio por que existe en la clase abstracta padre.
    @Override
    public void clean() {
        System.out.println("Clean the lion.");
    }
}
