package src;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter your choice (1 or 2)");
        int choice = sc.nextInt();

        System.out.println("Enter the temperature:");
        double temperature = sc.nextInt();

        if (choice == 1) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        }
    }
}
