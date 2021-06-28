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
public interface AbstractFactory {
    IButton getButton();
    ITable getTable();
    IText getText();
}
