/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg001_advanced_class_design;

import Additional.P056Bobcatkitten;

/**
 *
 * @author HUGO
 */

/*
  Bobcatkitten hereda de Bobcat, en la clase Bobcatkitten se agrego el metodo findDen, que tambien
  existe en su clase padre, pero al momento de ejecutar el metodo que se ejecuta es el del hijo, 
  por que estamos sobre-escribiendo (overriding), para el caso del metodo  testOverride() es igual.

  El metodo hasAlgo aplica Overload ya que genera varios metodos con el mismo nombre, pero diferentes
  parametros de entrada.
*/
public class P056_Overloading_and_Overriding {
        public static void main(String[] args) {
            P056Bobcatkitten cat= new P056Bobcatkitten();
            
            //Ejemplos de Override
            cat.findDen();
            cat.testOverride();
            
            //Ejemplos de Overload
            cat.hasAlgo();
            cat.hasAlgo(6);
            cat.hasAlgo(4, 7);
        }
}
