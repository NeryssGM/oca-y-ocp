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
public class Screen {
    
    public void Show(AbstractFactory factory){
        System.out.println("--------------------------------BEGIN SCREEN");
        factory.getText().CreateText();
        factory.getText().CreateText();
        factory.getTable().CreateTable();
        factory.getButton().CreateButton();
        System.out.println("--------------------------------END");
        
        
        
    }
    
}
