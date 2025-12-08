package Day1Fundamentals;//Flip a coin and print percentage of heads and tails
import java.util.*;
public class FlipACoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of flips: ");
        int n = sc.nextInt(); //no. of flips
        int t = 0; //tails
        int h = 0; //heads

        if (n >= 0) {
            System.out.println("Entered number is positive");
        }
        else {
            System.out.println("Entered number is not positive");
            System.exit(0);
        }

        for(int i=1;i<=n;i++) {
            double generate = Math.random();
            System.out.println(generate);
            if (generate < 0.5) {
                t = t + 1;
            } else {
                h = h + 1;
            }
        }
            System.out.println("No. of heads =" +h);
            System.out.println("No. of tails =" +t);

            double headPercent = (double) h/n*100;
            double tailPercent = (double) t/n*100;

            System.out.println("Head percent: "+ headPercent);
            System.out.println("Tail percent: "+ tailPercent);
        }
        }

