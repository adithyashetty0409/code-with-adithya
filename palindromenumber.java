public class palindromenumber
 {
    public static boolean ispalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) {
        int rem = n%10;
        reverse = reverse * 10 +rem;
        n=n/10;
        }
        return original == reverse;
        
    
    }
    public static void main(String[] args) {
        System.out.println(ispalindrome(121));
        System.out.println(ispalindrome(223));
        System.out.println(ispalindrome(232));
    }
}
