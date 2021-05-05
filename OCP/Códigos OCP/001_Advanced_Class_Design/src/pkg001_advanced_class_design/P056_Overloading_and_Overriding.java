/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg001_advanced_class_design;

import Additional.Bobcatkitten;

/**
 *
 * @author HUGO
 */

/*
  Bobcatkitten hereda de Bobcat, en la clase Bobcatkitten se agrego el metodo findDen, que tambien
  existe en su clase padre, pero al momento de ejecutar el metodo que se ejecuta es el del hijo.
*/
public class P056_Overloading_and_Overriding {
        public static void main(String[] args) {
            Bobcatkitten cat= new Bobcatkitten();
            cat.findDen();
        }
}
