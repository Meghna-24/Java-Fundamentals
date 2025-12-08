package datatypes;
import java.util.*;
public class EmployeeWageCalc {
    static int fullDayHour = 8;
    static int wagePerHour = 20;
    static int partTimeHour = 8;
    static int monthWorkingDays = 20;
    static int monthWorkingHours = 100;
    static int monthDays = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int attendance = checkAttendance();
        System.out.println("Employee Attendance: " + (attendance == 1 ? "Present" : "Absent"));
        System.out.println("Daily Wage: " + DailyWage(attendance));
        System.out.println("Part-Time Wage: " + PartTimeWage());
        System.out.println("Monthly Wage for 20 Days: " + MonthlyWage());

        WagesTillCondition();
    }

    public static int checkAttendance() {
        Random rand = new Random();
        return rand.nextInt(2);
    }

    public static int DailyWage(int attendance) {
        if (attendance == 1) {
            return fullDayHour * wagePerHour;
        }
        return 0;
    }

    public static int PartTimeWage() {
        return partTimeHour * wagePerHour;
    }

    public static int MonthlyWage() {
        return monthWorkingDays * wagePerHour * fullDayHour;
    }

    public static void WagesTillCondition() {
        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        Random rand = new Random();
        while (totalWorkingDays < monthWorkingDays && totalWorkingHours < monthWorkingHours) {
            totalWorkingDays++;
            int empType = rand.nextInt(3); // 0 for absent, 1 fulltime, 2 parttime

            switch (empType) {
                case 0:
                    System.out.println("Day " + totalWorkingDays + ": Absent");
                    break;

                case 1:
                    totalWorkingHours += fullDayHour;
                    totalWage += fullDayHour * wagePerHour;
                    System.out.println("Day " + totalWorkingDays + ": Full-Time");
                    break;

                case 2:
                    totalWorkingHours += partTimeHour;  // Add 8 hours to total working hours
                    totalWage += partTimeHour * wagePerHour; // Calculate and add wage
                    System.out.println("Day " + totalWorkingDays + ": Part-Time");
                    break;
            }
            System.out.println("Total Working Hours: " + totalWorkingHours + ", Total Wage: " + totalWage);
        }
        System.out.println("Total Wage after " + totalWorkingDays + " Days: " + totalWage);
    }
}


