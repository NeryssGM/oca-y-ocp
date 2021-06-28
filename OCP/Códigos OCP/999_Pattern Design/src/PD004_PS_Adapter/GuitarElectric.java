/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD004_PS_Adapter;

/**
 *
 * @author HUGO
 */
public class GuitarElectric implements IInstrumentElectric  {
    
    private String name="";
    
    public GuitarElectric(String name){
        this.name = name;
    }
    
    @Override
    public void TurnOn() {
        System.out.println("Turn On the guitar Electric "+this.name);
    }

    @Override
    public void TurnOff() {
        System.out.println("Turn Off the guitar Electric "+this.name);
    }
    
}
