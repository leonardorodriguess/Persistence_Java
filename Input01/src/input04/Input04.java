package input04;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        //sc.nextLine();
        //sc.nextLine();
        sc.nextLine();
        sc.nextLine();
        //System.out.println(sc.nextLine());
        String st =  sc.nextLine();
        System.out.println("");
        System.out.println(st);
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        st = sc.nextLine();
        
        
        System.out.println("");
        System.out.println(st);
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        
        
        System.out.println("X: "        +", Y: "        );
        sc.close();
    }    
}
