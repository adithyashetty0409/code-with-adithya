public class mathclass {

    public static double avg(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {

        System.out.println(Math.max(Math.max(10, 20), 30));

        System.out.println(Math.min(Math.min(20, 30), 50));

        System.out.println(Math.sqrt(40));

        System.out.println(Math.pow(4, 2));

        System.out.println(Math.abs(-30));

        System.out.println(avg(20, 40, 50));
    }
}