import java.util.*;
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("The total price is" + total);

        float grandtotal = total +(0.18f3 * total);
         System.out.println("Bill with 18% tax is" + grandtotal);
    }
}