/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areacircle;

/**
 *
 * @author kabut2496
 */
public class AreaCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 15;
        double pi = 3.14;
        double area = 0.0;
        // algorithm for area calc
        area = pi * radius * radius;
        System.out.println("the area " + area + " cm squared");

    }
    
}
