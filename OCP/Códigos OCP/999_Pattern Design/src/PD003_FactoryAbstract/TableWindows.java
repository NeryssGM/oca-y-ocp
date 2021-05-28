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
public class TableWindows implements ITable{
    @Override
    public void CreateTable() {
        System.out.println("Crete Table Windows");
    }
}
