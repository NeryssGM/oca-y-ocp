/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD001_PC_Singlenton;

/**
 *
 * @author HUGO
 */


/*
  Singlenton: Es un patron que sirve para que una clase solo exista instanciada una sola vez en todo 
  el código,  trabaja similar a lo que seria una variable global.
*/
public class PD001_Singleton {
    
    private static PD001_Singleton instance= null;
    private String value;
    
    private PD001_Singleton(String value)
    {
        this.value = value;
    }
    
    
    public static PD001_Singleton getInstance(String value){
       if(instance==null){
           instance= new PD001_Singleton(value);
       }
       return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    
    
    
    
}
