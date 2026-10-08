import java.util.Scanner;
public class BankAccount {
    public static void displayBankAccountDetails(String accountHolderName, String accountNumber, double balance) {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String accountHolderName = "John Doe";
        String accountNumber = "1234567890";
        double balance = 5000.0;
        System.out.println("Enter Amount to Deposit: ");
        double depositAmount = sc.nextDouble();
        System.out.println("Enter Amount to Withdraw: ");
        double withdrawAmount = sc.nextDouble();
        if (withdrawAmount <= balance) {
            System.out.println("Withdrawal Successful!");
            
        }
        else {
            System.out.println("Insufficient Balance!");
        }
        balance += depositAmount;
        balance -= withdrawAmount;
        displayBankAccountDetails(accountHolderName, accountNumber, balance);
    }
}