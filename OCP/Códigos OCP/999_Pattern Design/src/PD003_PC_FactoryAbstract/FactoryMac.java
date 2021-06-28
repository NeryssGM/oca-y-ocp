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
public class FactoryMac implements AbstractFactory{
    
    @Override
    public IButton getButton() {
        return new ButtonMac();
    }

    @Override
    public ITable getTable() {
        return new TableMac();
    }

    @Override
    public IText getText() {
        return new TextMac();
    }
}
