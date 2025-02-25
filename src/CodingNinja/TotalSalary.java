package src.CodingNinja;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the basic salary and the grade: ");
        int basic = scanner.nextInt();
        String s = scanner.next();
        double hra = basic*0.2;
        double da = basic*0.5;
        double pf = basic*0.11;
        int totalSalary = 0;
        if(s.equals("A")){
            totalSalary += 1700;
            //System.out.println("A");
        }
        else if (s.equals("B")){
            totalSalary += 1500;
            //System.out.println("B");
        }
        else{
            totalSalary += 1300;
            //System.out.println("Else");
        }
        totalSalary += (int) Math.round(basic + hra + da -pf);
        System.out.println("basic "+basic);
        System.out.println("HRA "+hra);
        System.out.println("DA "+da);
        System.out.println("PF "+pf);
        System.out.println("totalSalary "+totalSalary);
    }
}
