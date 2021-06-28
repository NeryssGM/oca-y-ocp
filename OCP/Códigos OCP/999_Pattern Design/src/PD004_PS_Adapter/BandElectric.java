/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD004_PS_Adapter;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUGO
 */
public class BandElectric {
    
    public static void Play(ArrayList<IInstrumentElectric> instrumentos){
        instrumentos.forEach((inst)->{
               inst.TurnOn();
        });

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BandElectric.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        instrumentos.forEach((inst)->{
             inst.TurnOff();
        });
    }
    
}
