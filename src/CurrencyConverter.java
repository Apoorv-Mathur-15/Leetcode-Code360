package src;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency Converter");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.println("3. Custom Converter");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();
        final double Usd_To_Eur = 0.85;
        final double Eur_To_Usd = 1.18;
        double convertedAmount;
        switch (choice) {
            case 1:
                convertedAmount = amount * Usd_To_Eur;
                System.out.println("Amount in Eur: " + convertedAmount);
                break;
            case 2:
                convertedAmount = amount * Eur_To_Usd;
                System.out.println("Amount in Usd: " + convertedAmount);
                break;
            case 3:
                System.out.println("To which currency you want to convert it to? ");
                String curr = scanner.next();
                System.out.println("Enter the convertor value: ");
                double A_TO_B = scanner.nextDouble();
                convertedAmount = amount * A_TO_B;
                System.out.println("Amount in " + curr + " : " + convertedAmount);
                break;
            default:
                System.out.println("Invalid choice..");
        }
    }
}
