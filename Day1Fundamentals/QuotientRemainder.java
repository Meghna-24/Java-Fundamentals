package Day1Fundamentals;//Quotient and Remainder
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor  = sc.nextInt();

        int quotient = dividend/divisor;
        System.out.println(quotient);

        int remainder = dividend%divisor;
        System.out.println(remainder);
    }
}
