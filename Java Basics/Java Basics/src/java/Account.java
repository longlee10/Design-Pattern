package java;

// Encapsulation example:
public class Account {
    private double balance;

    public void deposit(double amount){
        if(amount < 0)
            throw new Error("Amount can't be negative");

        balance += amount;
    }

    public void withdraw(double amount){
        if(amount < 0)
            throw new Error("Amount can't be negative");

        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
}
