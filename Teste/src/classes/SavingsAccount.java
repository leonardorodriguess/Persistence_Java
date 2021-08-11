/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Sec.Obras
 */
public class SavingsAccount {
    private double balance;
    private double interestRate;
    private String name;


    public void deposit (int x){
        setBalance(getBalance() + x);
    }


    public SavingsAccount(double b, String n) {
        this.balance = b;
        this.interestRate = 0.1;
        this.name = n;
    }

    public SavingsAccount() {
    }

    public SavingsAccount(double b, double i, String n) {
        this.balance = b;
        this.interestRate = i;
        this.name = n;
    }

    public double calcInterest(){
        double interest = getBalance() * getInterestRate() / 12;
        return interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dispalyCustomer(){
        System.out.println("Cliente" + getName());
    }
}
