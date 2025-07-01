public class Bank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 5000, 4);
        CheckingAccount ca = new CheckingAccount(102, 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount(103, 20000);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}

class BankAccount {
    protected int accountNumber;
    protected int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    int interestRate;

    public SavingsAccount(int accountNumber, int balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("It is a Savings Account.");
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate + "%\n");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    public CheckingAccount(int accountNumber, int balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("It is a Checking Account.");
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance + ", Withdrawal Limit: " + withdrawalLimit + "\n");
    }
}

class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(int accountNumber, int balance) {
        super(accountNumber, balance);
    }

    public void displayAccountType() {
        System.out.println("It is a Fixed Deposit Account.");
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance + "\n");
    }
}
