import java.util.Scanner;

public class Lab03Zad1Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wpisz number zadania (1 albo 2): ");
        int zad_nr = scanner.nextInt();

        if (zad_nr == 1) {
            zad1();
        } else if (zad_nr == 2) {
            zad2();
        } else {
            System.out.print("nieprawidlowy numer :(");
        }

    }

    private static void zad1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wpisz liczbe a: ");
        double a = scanner.nextInt();
        System.out.print("wpisz liczbe b: ");
        double b = scanner.nextInt();
        System.out.print("wpisz liczbe c: ");
        double c = scanner.nextInt();

        double x = najwieksza(a, b, c);
        System.out.println("najwieksza liczba to " + x);
    }

    private static void zad2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wpisz dlugosc promienia kola: ");

        int r = scanner.nextInt();
        narysuj_kolo(r);
    }

    private static double najwieksza(double a, double b, double c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
            return c;
        }
        if (b > c) {
            return b;
        }
        return c;
    }

    private static void narysuj_kolo(int r) {
        for (int i = -r; i <= r; i++) {
            for (int j = -r; j <= r; j++) {
                int temp = i*i + j*j;
                if (temp <= (r*0.33+0.1)*(r*0.33+0.1)) {
                    System.out.print("#  ");
                } else if (temp <= (r*0.66+0.1)*(r*0.66+0.1)) {
                    System.out.print("*  ");
                } else if (temp <= (r+0.1)*(r+0.1)) {
                    System.out.print("'  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}