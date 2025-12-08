package datatypes;
import java.util.*;
public class LineComparisonProblem {
    public static int calculateLength(double x1, double y1, double x2, double y2){
        return (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static boolean isEqual(double length1, double length2) {
        return length1 == length2;
    }
    public static int compareLength(double length1, double length2) {
        if (length1 == length2) {
            return 0;
        } else if (length1 > length2) {
            return 1;
        } else {
            return -1;
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter coordinates of first line:");
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        System.out.println("Enter coordinates of second line:");
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();
        System.out.print("Enter x4: ");
        double x4 = sc.nextDouble();
        System.out.print("Enter y4: ");
        double y4 = sc.nextDouble();

        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(x3, y3, x4, y4);

        System.out.println("Length of first line: " + length1);
        System.out.println("Length of second line: " + length2);

        if (isEqual(length1, length2)) {
            System.out.println("The lines are equal.");
        } else {
            System.out.println("The lines are not equal.");
        }

        int comparisonResult = compareLength(length1, length2);
        if (comparisonResult == 0) {
            System.out.println("The lines are equal.");
        } else if (comparisonResult == 1) {
            System.out.println("The first line is greater than the second line.");
        } else {
            System.out.println("The second line is greater than the first line.");
        }
    }
}
