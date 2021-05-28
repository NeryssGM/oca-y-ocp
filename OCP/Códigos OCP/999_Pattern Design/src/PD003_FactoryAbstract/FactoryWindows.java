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
public class FactoryWindows implements AbstractFactory{

    @Override
    public IButton getButton() {
        return new ButtonWindows();
    }

    @Override
    public ITable getTable() {
        return new TableWindows();
    }

    @Override
    public IText getText() {
        return new TextWindows();
    }
    
}
