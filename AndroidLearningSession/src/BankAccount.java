/**
 * The BankAccount class encapsulates the balance of a bank account.
 * It provides methods to deposit, withdraw money, and get the current balance.
 *
 */
public class BankAccount {
    // Private property to hold the balance of the account
    private double balance;

    // Constructor to initialize the balance to 0.0
    public BankAccount() {
        this.balance = 0.0;
    }

    // Method to deposit a certain amount into the account
    public double deposit(double amount) {
        //it will  Check if the amount is positive
        if (amount > 0) {
            // it will Add the amount to the balance
            balance += amount;
        }
        // it will Return the deposited amount
        return amount;
    }

    // this is Method to withdraw a  amount from the account
    public double withdraw(double amount) {
        // Check if the amount is positive and less than or equal to the balance
        if (amount > 0 && amount <= balance) {
            // Subtract the amount from the balance
            balance -= amount;
        }
        // Return the withdrawn amount (for simplicity, to show the input value)
        return amount;
    }

    // Method to get the current balance of the account
    public double getBalance() {
        return balance;
    }
}


class  BankAcc{

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        double newBalance = account.deposit(1000.0);
        System.out.println("Balance after deposit: " + newBalance);

        newBalance = account.withdraw(50.0);
        System.out.println("Balance after withdrawal: " + newBalance);

        System.out.println("Current balance: " + account.getBalance());

    }
}




