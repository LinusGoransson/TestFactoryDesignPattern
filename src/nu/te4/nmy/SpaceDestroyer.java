/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.nmy;

/**
 *
 * @author Lobo
 */
public class SpaceDestroyer extends EnemyShip {

    private double shield;

    public SpaceDestroyer(String name, double damage, double hitPoints, double hitRatio) {
        super(name, damage, hitPoints, hitRatio);
        shield = 1000;
    }

    public SpaceDestroyer() {
        super("SpaceDestroyer", 50, 5000, 0.1);
        shield = 1000;
    }

    @Override
    public void displayShip() {
        if (isAlive && shield > 0) {
            System.out.println(name + " finns där ute men använder stealthmode");
        } else if (isAlive) {
            super.displayShip(); //använd superklassen
        }
    }

    @Override
    public void damageEnemy(double hit) {
        if (shield > 0) {
            shield -= hit; //först tar skotten i skölden
            System.out.println("Skottet tar i skölden: "+shield+" hp kvar i skölden");
        } else {
            super.damageEnemy(hit); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
