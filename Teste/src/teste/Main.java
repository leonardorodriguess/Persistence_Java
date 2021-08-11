/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Sec.Obras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Met calc = new Met();

        calc.originalPrice = 100;
        calc.findTotal();


        //int x = Integer.parseInt(JOptionPane.showInputDialog("vlr x"));
        //int y = Integer.parseInt(JOptionPane.showInputDialog("vlr y"));
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();




        double z =  (double) x/y;
        //float w = x/y;
        //System.out.println(w);
        String st = "asdfasf sadf ";
        int a = (int) st.length();
        System.out.println(a);
        //st = "1111";
        //z = Double.parseDouble(st);


        System.out.println(st + z);
        //System.out.println(z);
    }
}
