public class Main {
    public static void main(String[] args) {
        int n = 5;
        double x = 1;

        double wynik = s(n, x);
        System.out.println("s(" + n +", " + x + ") = " + wynik);
    }

    private static double s(int n, double x) {
        if (x < 0) {
            return 2;
        }
        if (x <= 2) {
            return Math.cos(x) + x;
        }
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (Math.pow(x, i)) / i;
        }
        return sum;
    }
}