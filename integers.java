import java.util.*;

public class integers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {

            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum = evenSum + num;
            } else {
                oddSum = oddSum + num;
            }
        }

        System.out.println("Even sum is " + evenSum);
        System.out.println("Odd sum is " + oddSum);
    }
}