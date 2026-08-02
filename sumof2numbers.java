import java.util.*;

public class sumof2numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        int counter = 1;

        while (counter <= n) {
            sum += counter;
            counter++;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
