package Synchronization;
public class ProcessSynchronization{
    private int accountBalance = 1000;
    public synchronized void deposit(int amount){
        this.accountBalance += amount;
        System.out.println("Amount deposited: " + amount + " Account Balance is: " + accountBalance);
    }

    public synchronized void withDraw(int amount){
        if(accountBalance >= amount){
            this.accountBalance -= amount;
            System.out.println("Amount Withdrawn: " + amount + " Account Balance is: " + amount);
        }else {
            System.out.println("Insufficient balance");
        }
    }
    public int getAccountBalance(){
        return this.accountBalance;
    }
}