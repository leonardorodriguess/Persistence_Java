package input01;

import javax.swing.JOptionPane;


public class Input01 {
    public static void main(String[] args) {
        String inputString = JOptionPane.showInputDialog("Digite um numero");  
        //tring input = Integer.parseInt(inputString); 
        //input++;

        //int input = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero")) +1;
        
        
        System.out.println(inputString);
    }
}
