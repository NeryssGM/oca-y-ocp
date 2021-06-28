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
public class GuitarAcoustic implements IInstrumentAcoustic {
    
    private String name="";
    
    public GuitarAcoustic(String name){
        this.name = name;
    }
    
    @Override
    public void Play() {
        System.out.println("Play Guitar Acoustic "+name);
    }

    @Override
    public void Leave() {
        System.out.println("Leave Guitar Acoustic "+name);
    }
    
}
