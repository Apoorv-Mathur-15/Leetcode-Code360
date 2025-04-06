package src.CodingNinja;

public class DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year){
        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Array to store number of days passed before each month (for non-leap year)
        int[] noOfDaysPassedTillMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        // Leap year correction: for leap years, February has 29 days, so the days passed till month
        if (isLeapYear(year) && month > 2) {
            noOfDaysPassedTillMonth[month - 1]++;
        }

        // Calculate the number of days passed since 01/01/0001
        int totalNoOfDaysPassed = 365 * (year - 1) + noOfDaysPassedTillMonth[month - 1] + day;

        // Add the leap years that have occurred before the current year
        int leapDays = (year / 4) - (year / 100) + (year / 400);
        totalNoOfDaysPassed += leapDays;

        // Return the day of the week
        return dayNames[totalNoOfDaysPassed % 7];
    }

    // Helper method to check if the year is a leap year
    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(06, 04, 2025));
        System.out.println(dayOfTheWeek(29, 02, 1920));
        System.out.println(dayOfTheWeek(28, 07, 2020));
    }
}
