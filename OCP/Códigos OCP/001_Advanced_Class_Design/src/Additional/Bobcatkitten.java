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

/*
   En este caso estamos herando la clase de Bobcat, y luego le agregamos un metodo con el mismo nombre
   esto genera que cuando se ejecute el metodo, se tomara el código del hijo esto es llamado "OVERRIDE"
*/

public class Bobcatkitten extends Bobcat{
    public void findDen(){
        System.out.println("Este es el metodo hijo");
    }
}
