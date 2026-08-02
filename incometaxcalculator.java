import java.util.*;
public class incometaxcalculator{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Ammount");
    int amount = sc.nextInt();
    int tax;
    if (amount < 500000) {
      tax = 0;
    } else if(amount>=500000 && amount<=1000000) {
        tax = (int) (amount*0.2);

    }
       else {
          tax = (int) (amount*0.3);

    }
    System.out.println("Your tax is " + tax);
    }
    }


