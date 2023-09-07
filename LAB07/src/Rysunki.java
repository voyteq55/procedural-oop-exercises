public class Rysunki {
    private static Bryla[] bryla;
    private static int n;

    public static void main(String[] args) {
        bryla = new Bryla[20];
        wstawWalceDoTablicy();
        sprawdzNajwiekszePole();
        wyswietlBryly();
        wyswietlWalce();
        wyswietlProstopadlosciany();
        policzSzesciany();
        policzWalceKwadratowe();
    }

    private static void wstawWalceDoTablicy() {
        bryla[0] = new Prostopadloscian();
        bryla[1] = new Walec();
        bryla[2] = new Prostopadloscian("drugi prostopadloscian", 4, 2, 3);
        bryla[3] = new Walec("drugi walec", 10, 1);
        bryla[4] = new Prostopadloscian("trzeci prostopadloscian", 5, 5, 5);
        bryla[5] = new Walec("trzeci walec", 4, 4);
        bryla[6] = new Prostopadloscian("czwarty prostopadloscian", 2, 2, 2);
        bryla[7] = new Prostopadloscian("piaty prostopadloscian", 6, 5, 7);
        n = 8;
    }

    private static void sprawdzNajwiekszePole() {
        int indeksNajwiekszegoPola = 0;
        Bryla b = bryla[0];
        for (int i = 1; i < n; i++) {
            if (bryla[i].pole() > b.pole()) {
                indeksNajwiekszegoPola = i;
                b = bryla[i];
            }
        }
        System.out.println("Bryla o najwiekszym polu to " + b.getClass().getSimpleName() + " na pozycji " + indeksNajwiekszegoPola + ", pole: " + b.pole());
    }

    private static void wyswietlBryly() {
        System.out.println("\nBryly:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + bryla[i].toString());
        }
    }

    private static void wyswietlWalce() {
        System.out.println("\nWalce:");
        for (int i = 0; i < n; i++) {
            if (bryla[i] instanceof Walec) {
                System.out.println(bryla[i].toString());
            }
        }
    }

    private static void wyswietlProstopadlosciany() {
        System.out.println("\nProstopadlosciany:");
        for (int i = 0; i < n; i++) {
            if (bryla[i] instanceof Prostopadloscian) {
                System.out.println(bryla[i].toString());
            }
        }
    }

    private static void policzSzesciany() {
        int liczbaSzescianow = 0;
        for (int i = 0; i < n; i++) {
            if (bryla[i] instanceof Prostopadloscian) {
                if (((Prostopadloscian) bryla[i]).jestSzescianem()) {
                    liczbaSzescianow++;
                }
            }
        }
        System.out.println("\nLiczba szescianow: " + liczbaSzescianow);
    }

    private static void policzWalceKwadratowe() {
        int liczbaWalcow = 0;
        for (int i = 0; i < n; i++) {
            if (bryla[i] instanceof Walec) {
                if (((Walec) bryla[i]).obrotKwadratu()) {
                    liczbaWalcow++;
                }
            }
        }
        System.out.println("\nLiczba walcow powstalych przez obrot kwadratu: " + liczbaWalcow);
    }
}
