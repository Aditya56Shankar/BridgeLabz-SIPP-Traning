public class Bank {
    public static void main(String[] args) {
        BankDetails account1 = new BankDetails("Aditya", 5000, 1001);
        BankDetails account2 = new BankDetails("Shankar", 7500, 1002);
        account1.getTotalAccounts();
        account2.displayDetails();
    }
}

class BankDetails{
    static String bankName="sbi";
    static int totalAccounts = 0;
    String accountHolderName;
    double balance;
    final int accountNumber;

    public BankDetails(String accountHolderName, double balance,int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber=accountNumber;
        totalAccounts++;
        this.balance=balance;
    }

    static void getTotalAccounts(){
        System.out.println("total accounts: "+totalAccounts);
    }
    public void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);

    }
}
