import java.util.Scanner;

class BankAccount {
    private int accountHolderId;
    private final int accountNumber;
    private double balance;

    public BankAccount(int accountHolderId, int accountNumber, double initialBalance) {
        this.accountHolderId = accountHolderId;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println( amount + " deposited");
        }=
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println( amount + " withdrawn");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder ID: " + accountHolderId);
        System.out.println("Account Number   : " + accountNumber);
    }
}

public class AtmSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder ID (number): ");
        int id = sc.nextInt();

        System.out.print("Enter Account Number: ");
        int accNumber = sc.nextInt();

        System.out.print("Enter Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(id, accNumber, initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayBalance();
        account.displayAccountInfo();
    }
}
