import java.util.Scanner;

public class Lab03Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj liczbe n: ");

        int n = scanner.nextInt();
        System.out.println();

        int licznik_ulamka = licznik(n);
        int mianownik_ulamka = mianownik(n);
        double wartosc = (double) licznik_ulamka / (double) mianownik_ulamka;
        System.out.print("wartosc calego ulamka: " + wartosc);
    }

    private static int licznik(int n) {
        int temp = 2;
        int suma_wyrazow_ciagu = 0;
        System.out.print("wyrazy pierwszego ciagu (" + n + "-elementowego): ");
        for (int i = 1; i <= n; i++) {
            suma_wyrazow_ciagu += temp;
            System.out.print(temp + " ");
            temp += 3;
        }
        System.out.println();
        return suma_wyrazow_ciagu;
    }

    private static int mianownik(int n) {
        int temp = 3;
        int iloczyn_wyrazow_ciagu = 1;
        System.out.print("wyrazy drugiego ciagu (" + n + "-elementowego): ");
        for (int i = 1; i <= n; i++) {
            iloczyn_wyrazow_ciagu *= temp;
            System.out.print(temp + " ");
            temp *= -1;
            if (temp > 0) {
                temp += 4;
            } else {
                temp -= 4;
            }
        }
        System.out.println();
        return iloczyn_wyrazow_ciagu;
    }
}