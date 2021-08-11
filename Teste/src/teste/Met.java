/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

/**
 *
 * @author Sec.Obras
 */
public class Met {
        public double tax = 0.15;
        public double tip = 0.05;
        public double originalPrice = 10;

        public void findTotal(){
            System.out.println( originalPrice * (1 + tax + tip));
        }
    
}

