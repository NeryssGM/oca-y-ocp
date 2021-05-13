/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD002_Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author HUGO
 */
public class FactoryEnemysRandom implements IFactoryEnemys{

    @Override
    public void CreateEnemys(int Quantity) {
        int type=1;
        Random r= new Random();
        
        for(int x=0;x<Quantity;x++){
            type = (Math.round(r.nextFloat()*2))+1;
            
            switch(type)
            {
                case 1:
                    new EnemyLevel1().create();
                    break;
                case 2:
                    new EnemyLevel2().create();
                    break;
                case 3:
                    new EnemyLevel3().create();
                    break;
                default:
                    new EnemyLevel3().create();
                    break;
            }
        }
    }
    
}
