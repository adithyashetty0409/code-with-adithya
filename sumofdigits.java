public class sumofdigits {
    public static int sumofdigits(int n) {
        int sum =0;
        while(n>0) {
            int lastDigit = n%10;
            sum = lastDigit+sum;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(1234));
    }
    }

