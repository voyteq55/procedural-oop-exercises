import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        trojkat();
    }

    private static void kwadrat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj bok kwadratu: ");
        int a = scanner.nextInt();

        int p = a * a;
        int o = 4 * a;
        double d = a * Math.sqrt(2);

        System.out.println("pole kwadratu: " + p);
        System.out.println("obwod kwadratu: " + o);
        System.out.println("przekatna kwadratu: " + d);
    }

    private static void prostokat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 1. bok prostokatu: ");
        int a = scanner.nextInt();
        System.out.println("podaj 2. bok prostokatu: ");
        int b = scanner.nextInt();

        int p = a * b;
        int o = 2 * (a + b);
        double d = Math.sqrt(a * a + b * b);

        System.out.println("pole prostokata: " + p);
        System.out.println("obwod prostokata: " + o);
        System.out.println("przekatna prostokata: " + d);
    }

    private static void suma() {
        int a = 4;
        int b = 10;
        int suma = a + b;
        System.out.printf("%-7s%8s%n", "a =", a);
        System.out.printf("%-7s%8s%n", "b =", b);
        System.out.println("- - - - - - - -");
        System.out.printf("%-7s%8d%n", "suma = ", suma);
    }

    private static void funkcja() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double t;
        if (a >= b) {
            t = 2 * a + Math.abs(b) - 1;
        } else {
            t = Math.sin(a) - b * b;
        }
        System.out.println(t);
    }

    private static void trojkat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj 1. bok trojkata: ");
        int a = scanner.nextInt();
        System.out.print("podaj 2. bok trojkata: ");
        int b = scanner.nextInt();
        System.out.print("podaj 3. bok trojkata: ");
        int c = scanner.nextInt();

        if (Math.abs(b - c) < a && a < (b + c)) {
            double p = ((double) (a + b + c)) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("pole trojkata: " + s);
        } else {
            System.out.println("trojkat z podanymi bokami nie istnieje :(");
        }

    }
}