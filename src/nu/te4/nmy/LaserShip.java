/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.nmy;

import java.util.Random;

/**
 *
 * @author Lobo
 */
public class LaserShip extends EnemyShip{

    public LaserShip(String name, double damage, double hitPoints, double hitRatio) {
        super(name, damage, hitPoints, hitRatio);
    }
    
    public LaserShip(){
             super("LaserShip", 100, 500, 0.5);
    }

    @Override
    public void enemyShipShoots() {
        Random r = new Random();
        if(r.nextBoolean()){
            System.out.println(name +" träffar dig med brännande laser, du får "+damage+" skada");
        }else{
         System.out.println(name +" missar dig laser.");
        }
    }
    
}
