package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        System.out.println("digite:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        
        x =  x + y + z; 
        //System.out.println(sc.nextInt());
        //sc.close();
        
        //System.out.println(sc.nextInt());
        
        System.out.println("x: "+ x);
        //System.out.println("y: "+ y);
        //System.out.println("z: "+ z);
    }
}