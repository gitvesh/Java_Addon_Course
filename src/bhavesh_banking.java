import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Bank {
    private String accountNumber;
    private int pin;
    private double balance;

    public Bank(String accountNumber, int pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0.0;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public double debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return balance;
        }
        return 0;
    }

    public double checkBalance() {
        return balance;
    }

    public boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }

    public void changePin(int newPin) {
        pin = newPin;
    }


}

public class bhavesh_banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank currentAccount = null;
        ArrayList<Bank> a=new ArrayList<>();
        ArrayList<Double> trs=new ArrayList<>();
        while (true) {
            System.out.println("------------------------Welcome to the Bhavesh Bank of India--------------------------------");
            System.out.println("1) Create Account\n2) Bank Transaction\n3) Print Passbook\n4) Change Pin\n5) Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter account number:");
                    String accNum = scanner.next();
                    System.out.println("Enter PIN:");
                    int accPin = scanner.nextInt();
                    currentAccount = new Bank(accNum, accPin);
                    a.add(currentAccount);
                    break;
                case 2:
                    if (currentAccount == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.println("1) Credit\n2) Debit\n3) Check Balance ") ;
                    int transChoice = scanner.nextInt();
                    switch (transChoice) {
                        case 1:
                            System.out.println("Enter amount to credit:");
                            double creditAmount = scanner.nextDouble();
                            currentAccount.credit(creditAmount);
                            trs.add(creditAmount);
                            break;
                        case 2:
                            System.out.println("Enter amount to debit:");
                            double debitAmount = scanner.nextDouble();
                            double v=currentAccount.debit(debitAmount);
                            if(v==0)
                            {
                                System.out.println("Insufficient balance !!");
                            }
                            debitAmount=-1*debitAmount;
                            trs.add(debitAmount);
                            break;
                        case 3:
                            System.out.println("Current balance: " + currentAccount.checkBalance());
                            break;


                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 3:
                    if (currentAccount == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.println("Enter PIN to print passbook:");
                    int enteredPin = scanner.nextInt();
                    if (currentAccount.validatePin(enteredPin)) {
                        // Code to fetch and display last 10 transactions
                        System.out.println("Printing passbook...");
                        System.out.println("Your Transactions Are : ");
                        Iterator i= (Iterator) trs.iterator();
                        while(i.hasNext())
                        {
                            System.out.println(i.next());
                        }
                        break;
                    } else {
                        System.out.println("Invalid PIN.");
                    }
                    break;


                case 4:
                    if (currentAccount == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.println("Enter account number:");
                    String accNumber = scanner.next();
                    System.out.println("Enter DOB:");
                    // Assuming DOB validation code here
                    System.out.println("Enter new PIN:");
                    int newPin = scanner.nextInt();
                    currentAccount.changePin(newPin);
                    System.out.println("PIN changed successfully.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
