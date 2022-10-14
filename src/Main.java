public class Main {
    public static void main(String[] args) {
        double a = 4;
        double b = 6;
        double c = 123;

        double x = najwieksza(a, b, c);
        System.out.println("najwieksza liczba to " + x);
    }

    private static double najwieksza(double a, double b, double c) {
        if (a > b) {
            return Math.max(a, c);
        }
        return Math.max(b, c);
    }
}