package Day1Fundamentals;// POWER OF 2
import java.util.Scanner;
public class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int n = sc.nextInt();

        if(n<31 && n>=0){
            System.out.println("Valid input");
            double power = Math.pow(2,n);
            System.out.println(power);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
