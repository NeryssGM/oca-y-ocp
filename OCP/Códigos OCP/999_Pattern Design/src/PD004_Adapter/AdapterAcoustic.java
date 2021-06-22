/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD004_Adapter;

/**
 *
 * @author HUGO
 */
public class AdapterAcoustic implements IInstrumentElectric{
    
    private String name;
    private GuitarAcoustic guitar;
    public AdapterAcoustic(GuitarAcoustic guitar){
        this.guitar=guitar;
    }

    @Override
    public void TurnOn() {
        this.guitar.Play();
    }

    @Override
    public void TurnOff() {
        this.guitar.Leave();
    }
}
