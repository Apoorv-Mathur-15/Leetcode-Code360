package src.HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradesSystem {

    private static ArrayList<Student> students = new ArrayList<>();

    private static Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name))
                return student;
        }
        return null;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. View Students");
            System.out.println("4. Exit");
            System.out.println("Choose an option");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter Student Name:");
                    String name = scanner.nextLine();
                    students.add(new Student(name));
                    System.out.println("Student added...");
                    break;
                case 2:
                    System.out.println("Enter Student Name: ");
                    name = scanner.nextLine();
                    Student student = findStudentByName(name);
                    if (student != null) {
                        System.out.println("Enter Grade:");
                        double grade = scanner.nextDouble();
                        student.addGrade(grade);
                        System.out.println("Grade added.");
                    } else
                        System.out.println("Student not found.");
                    break;
                case 3:
                    if (students.isEmpty())
                        System.out.println("No student data found..");
                    else {
                        for (Student s : students)
                            System.out.println(s);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, try again");
            }
        }
    }

    static class Student {
        String name;
        ArrayList<Double> grades = new ArrayList<>();

        Student(String name) {
            this.name = name;
        }

        void addGrade(double grade) {
            grades.add(grade);
        }

        double calculateAverage() {
            if (grades.isEmpty())
                return 0.0;
            double sum = 0;
            for (double grade : grades)
                sum += grade;
            return sum / grades.size();
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Average Grade: " + calculateAverage();
        }
    }
}
