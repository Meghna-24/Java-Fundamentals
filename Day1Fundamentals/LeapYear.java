package Day1Fundamentals;//LEAP YEAR
import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();

        if(year>999 && year<10000){
            System.out.println("Year is Valid");
            if(year%4==0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
        else{
            System.out.println("Invalid");
        }

    }
}
