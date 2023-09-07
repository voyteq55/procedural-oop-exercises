import java.math.BigInteger;
import java.util.Random;

public class Tablica {
    public static int[] losowaTablica(int n) {
        if (n < 0) {
            return new int[0];
        }
        Random randomizer = new Random();
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = randomizer.nextInt(100);
        }
        return t;
    }

    public static void wyswietlElementy(int[] t) {
        System.out.print("Elementy tablicy: ");
        for (int i = 0; i < t.length; i++) {
            if (i == t.length - 1) {
                System.out.print(t[i] + "\n");
            } else {
                System.out.print(t[i] + ", ");
            }
        }
    }

    public static Integer wartoscMinimalna(int[] t) {
        if (t.length == 0) {
            return null;
        }
        int min = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] < min) {
                min = t[i];
            }
        }
        return min;
    }

    public static BigInteger iloczynNieparzystych(int[] t) {
        BigInteger iloczyn = null;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 1) {
                if (iloczyn == null) {
                    iloczyn = BigInteger.valueOf(t[i]);
                } else {
                    iloczyn = iloczyn.multiply(BigInteger.valueOf(t[i]));
                }
            }
        }
        return iloczyn;
    }

    public static int ileLiczbNieparzystych(int[] t) {
        int liczbaNieparzystych = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 1) {
                liczbaNieparzystych++;
            }
        }
        return liczbaNieparzystych;
    }
}
