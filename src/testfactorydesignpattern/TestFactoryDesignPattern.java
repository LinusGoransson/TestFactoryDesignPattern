/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfactorydesignpattern;
import java.util.Scanner;
import nu.te4.nmy.*;
/**
 *
 * @author Lobo
 */
public class TestFactoryDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EnemyShip enemyShip; //den fiende vi skall använda.
        System.out.print("Vilken fiende önskas(L/S): ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            String ship = scanner.nextLine();
            System.out.println("Du skrev "+ship);
            
            
        }
        
   }
    
}
