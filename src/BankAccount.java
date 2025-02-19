package src;

import java.util.Scanner;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        String command;

        do {
            System.out.println("Enter the command please (deposit/withdraw/check/exit): ");
            command = sc.nextLine();
            switch (command) {
                case "deposit":
                    System.out.println("Enter the amount to deposit:");
                    double deposit = sc.nextDouble();
                    System.out.println(account.deposit(deposit));
                    break;
                case "withdraw":
                    System.out.println("Enter the amount to withdraw:");
                    double withdraw = sc.nextDouble();
                    System.out.println(account.withdraw(withdraw));
                    break;
                case "check":
                    System.out.println(account.checkBalance());
                    break;
                case "exit":
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid Command...");
            }
        } while (!command.equalsIgnoreCase("exit"));
    }

    public String deposit(double amount) {
        balance += amount;
        return "Amount Deposited: $" + amount;
    }

    public String withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            return "Amount Withdrawn: $" + amount;
        } else {
            return "Insufficient Balance...";
        }
    }

    public String checkBalance() {
        return "Current Balance: $" + balance;
    }
}
