/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.nmy;

import java.util.Random;

/**
 * Klassen är abstrakt för vi skall inte
 * kunna skapa några fiendeskepp direkt
 * utan bara sub-klasser såsom stardestroyers etc
 */
public abstract class EnemyShip {
    protected String name; 
    protected double damage;
    protected double hitpoints;
    protected double hitRatio;
    protected boolean isAlive;

    public EnemyShip(String name, double damage,double hitPoints ,double hitRatio) {
        this.name = name;
        this.damage = damage;
        this.hitpoints = hitPoints;
        this.hitRatio = hitRatio;
        isAlive = true;
    }

    public EnemyShip() {
    }
    
    
    public void followHero(){
        //kod för att följa efter oss
        if(isAlive){
            System.out.println(name+ " följer nu efter vårt skepp.");
        }
    }
    public void displayShip(){
        //kod för att dyka upp
        if(isAlive){
            System.out.println(name+ " dyker nu upp på skärmen.");
        }
    }
    public void damageEnemy(double hit){
        hitpoints -= hit;
        System.out.println("Fienden har nu "+hitpoints+" kvar");
        if(hitpoints <= 0){ isAlive = false;}
    }
    
    public void enemyShipShoots(){
        //kod
        Random r = new Random();
        System.out.println(name +" skjuter och ger dig "+damage*r.nextDouble()+" skada");
    }
    
    
}
