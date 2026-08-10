public class reverseofanumber {
      public static void main(String[] args) {
        int n = 958678;
        while(n>0) {
            int lastDigit = n%10;
            System.out.print(lastDigit + " ");
            n/=10; 
        }
        System.out.println();
      }    
}
