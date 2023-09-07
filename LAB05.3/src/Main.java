import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wpisz liczbe n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int[][] t = new int[n][];
            int temp = 1;
            for (int i = 0; i < t.length; i++) {
                t[i] = new int[i + 1];
                for (int j = 0; j < t[i].length; j++) {
                    t[i][j] = temp;
                    temp++;
                }
            }
            wypiszTablice(t);
        }
    }

    public static void wypiszTablice(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%5d", t[i][j]);
            }
            System.out.print("\n");
        }
    }
}
