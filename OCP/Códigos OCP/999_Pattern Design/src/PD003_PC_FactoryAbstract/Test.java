/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD003_PC_FactoryAbstract;

/**
 *
 * @author HUGO
 */
public class Test {
    public static void main(String[] args){
        
        Screen screen= new Screen();
        screen.Show(new FactoryMac());
        screen.Show(new FactoryWeb());
        screen.Show(new FactoryWindows());
    }
            
    
}
