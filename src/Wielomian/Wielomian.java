package Wielomian;

public class Wielomian {
    public static double Hermite(int n, double x) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2 * x;
        }
//        return 2 * x * Hermite(n - 1, x) - 2 * (n - 1);
        double temp0 = 1;
        double temp1 = 2 * x;
        double temp2 = 0;
        for (int i = 2; i <= n; i++) {
            temp2 = 2 * x * temp1 - 2 * (i - 1) * temp0;
            temp0 = temp1;
            temp1 = temp2;
        }
        return temp2;
    }
}