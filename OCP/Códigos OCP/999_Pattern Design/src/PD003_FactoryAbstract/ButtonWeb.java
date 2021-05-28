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
public class ButtonWeb implements IButton{

    @Override
    public void CreateButton() {
        System.out.println("Create Button Web");
    }
    
}
