/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD004_PS_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HUGO
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<IInstrumentElectric> listInstrument= new ArrayList<>();
        
        listInstrument.add(new GuitarElectric("Robert"));
        listInstrument.add(new GuitarElectric("Alfred"));
        listInstrument.add(new GuitarElectric("Richard"));
        listInstrument.add( new AdapterAcoustic(new GuitarAcoustic("Sandy")));
        
        BandElectric.Play((ArrayList<IInstrumentElectric>) listInstrument);
        
    }
    
}
