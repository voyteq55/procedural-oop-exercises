import java.util.Scanner;

public class Lab03Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("podaj liczbe n: ");
        int n = scanner.nextInt();
        System.out.print("podaj liczbe m: ");
        int m = scanner.nextInt();

        if (n < m) {
            System.out.print("szukana suma to: " + (suma_nieparzystych_z_przedzialu(n, m)));
        } else {
            System.out.print("podano nieprawidlowe liczby");
        }

    }
    private static int suma_nieparzystych_z_przedzialu(int n, int m) {
        int suma = 0;
        for (int i = n; i <= m; i++) {
            if (i % 2 == 1) {
                suma += i;
            }
        }
        return suma;
    }
}