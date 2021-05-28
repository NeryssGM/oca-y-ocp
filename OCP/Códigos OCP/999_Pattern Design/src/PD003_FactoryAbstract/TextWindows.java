/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD003_FactoryAbstract;

/**
 *
 * @author HUGO
 */
public class TextWindows  implements IText{

    @Override
    public void CreateText() {
        System.out.println("Create Text Windows");
    }
    
}
