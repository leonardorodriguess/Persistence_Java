/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.util.ArrayList;
import java.util.ListIterator;
/**
 *
 * @author Sec.Obras
 */
public class AccountTest {
    public static void main(String[] args){

        //----------Vetor--------------
        //int v[] = {10,5,20,5};
        //int v [] = new int [4];
        //System.out.println("tam " + v.length);
        //String names[] = {"Mary", "Bob", "Carlos"};
        //v[4] = 11;
        //System.out.println(v[0] +" "+  v[1] +" "+ v[2] + " " + v[3] );
                //+ " " + v[4]);


        // ----------Construtor-----------
        //SavingsAccount sa0001 = new SavingsAccount(1000.0, 0.2, "Daniel");
        //SavingsAccount sa0002 = new SavingsAccount(2000, "Bill");
        //sa0001.SavingsAccount(1000.0, 0.2, "Daniel");
        /*sa0001.deposit(1000);
        sa0001.name = "Daniel";
        sa0001.setInterestRate(0.02);
        sa0001.balance += sa0001.calcInterest();*/

        /*int saque = 0;
        if (sa0001.getBalance() > 0 && sa0001.getBalance() - saque >= 0){
            sa0001.deposit(-saque);
            System.out.println("Saque feito com sucesso");
        } else {
            System.out.println("saldo insuficiente ");
        }

        System.out.println("valor " +  sa0001.getBalance()); */

        

        //-----------ArrayList
        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> list = new ArrayList<Integer>();
      
        names.add("Jamie");
        names.add("Gustavo");
        //list.add(10);

        //String str = names.get(0);
        //System.out.println(str);

        //names.remove(0);
        //names.remove(names.size() - 1);
        //names.remove("Gustavo");

        /*ListIterator<String> litr = names.listIterator();
        while (litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("");
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        System.out.println("");*/


        /*for(String i: names)
            System.out.println(i);*/

        System.out.println("");
        for(int i = 50; i > 0; i--)
            list.add(i);

        /*for(Integer i:list){
            System.out.print(i + " ");
        }
        System.out.println("");*/

        for(int i = 0; i < list.size(); i++ ){
            if(list.get(i) % 2 != 0)
                list.remove(i);
        }

        System.out.println(list);
        System.out.println(names + " " + names.size() + " " + "");


    }
}
