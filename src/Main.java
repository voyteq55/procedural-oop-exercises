public class Main {
    public static void main(String[] args) {
        double a = 4;
        double b = 6;
        double c = 123;

        double x = najwieksza(a, b, c);
        System.out.println("najwieksza liczba to " + x);

        narysuj_okrag(25);
    }

    private static double najwieksza(double a, double b, double c) {
        if (a > b) {
            return Math.max(a, c);
        }
        return Math.max(b, c);
    }

    private static void narysuj_okrag(int r) {
        for (int i = -r; i <= r; i++) {
            for (int j = -r; j <= r; j++) {
                if (i*i + j*j <= (r+0.1)*(r+0.1)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}