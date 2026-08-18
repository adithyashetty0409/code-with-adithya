public class binarytodecimal {
    public static void bintoDec(int binnum) {
        int pow = 0;
        int DecNum = 0;
        int original = binnum;

        while (binnum > 0) {
            int lastDigit = binnum % 10;

            DecNum = DecNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binnum = binnum / 10;
        }

        System.out.println("decimal of " + original + " = " + DecNum);
    }

    public static void main(String[] args) {
        bintoDec(100);
    }
}