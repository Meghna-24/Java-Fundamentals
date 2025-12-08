package Day1Fundamentals;//Swap 2 Numbers
import java.util.Scanner;
public class SwapTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("No.s before Swapping: ");
        System.out.println(n);
        System.out.println(m);

        int temp = n;
        n=m;
        m=temp;

        System.out.println("No.s after Swapping: ");
        System.out.println(n);
        System.out.println(m);

    }
}
