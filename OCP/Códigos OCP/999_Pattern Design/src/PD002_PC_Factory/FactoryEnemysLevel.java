/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD002_PC_Factory;

/**
 *
 * @author HUGO
 */
public class FactoryEnemysLevel implements IFactoryEnemys {
    
    private int level=1;

    @Override
    public void CreateEnemys(int Quantity) {
        for(int x=0;x<Quantity;x++)
        {
            switch(level){
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
                    System.out.println("Otro nivel");
                    break;
            }
            
            if(this.level>3){
                    new FactoryEnemysRandom().CreateEnemys(Quantity);
            }
             
        }
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }
    
}
