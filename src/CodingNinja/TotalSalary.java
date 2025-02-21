package src.CodingNinja;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the basic salary and the grade: ");
        int basic = scanner.nextInt();
        String s = scanner.next();
        int totalSalary = (int) Math.round(basic + basic*0.2 + basic*0.5 -basic*0.11);
        if(s == "A")
            totalSalary += 1700;
        else if (s == "B")
            totalSalary += 1500;
        else
            totalSalary += 1300;
        System.out.println(totalSalary);
    }
}
