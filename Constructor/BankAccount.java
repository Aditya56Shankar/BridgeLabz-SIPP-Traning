
public class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void showAccountInfo() {
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Balance (via method): " + getBalance());
    }
}