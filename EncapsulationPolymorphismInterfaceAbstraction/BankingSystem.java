
import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) { System.out.println("Loan Applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() >= 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amount) { System.out.println("Loan Applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() >= 10000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA123", "Alice", 6000));
        accounts.add(new CurrentAccount("CA456", "Bob", 15000));

        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getHolderName() + ", Interest: " + acc.calculateInterest());
        }
    }
}
