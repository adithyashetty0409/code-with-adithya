public class binomialcoefficient {

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int bincoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr = n - r;
        int nmr_fact = factorial(nmr);

        int bincoeff = n_fact / (r_fact * nmr_fact);

        return bincoeff;
    }

    public static void main(String[] args) {
        System.out.println(bincoeff(5, 7));
    }
}