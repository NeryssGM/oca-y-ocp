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

public class P056Bobcatkitten extends P056Bobcat{
    
    // Metodo que sera aplica override al padre.
    public void findDen(){
        System.out.println("Este es el metodo hijo OverLoad");
    }
    
    
    //Metodo que aplica override al padre.
    @Override
    public void testOverride(){
                 super.testOverride();
                 System.out.println("Este es el hijo del Override");
    }
    
    
    //Metodos con Overload, es el mismo nombre con diferentes parametros de entrada.
    
    public void hasAlgo()
    {
        System.out.println("Hola, hice algo.");
    }
    public void hasAlgo(Integer x)
    {
        System.out.println("El numero:"+x.toString()+" Se elevo al cuadrado:"+(x*x));
    }
    public void hasAlgo(Integer x,Integer y)
    {
        System.out.println("El numero X:"+x.toString()+" y El numero Y:"+y.toString()+" Se sumaron "+(x+y));
    }
    
}
