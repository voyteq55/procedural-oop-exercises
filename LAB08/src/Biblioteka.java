public class Biblioteka {
    private static Osoba[] osoby;
    private static int n;

    public static void main(String[] args) {
        osoby = new Osoba[20];
        wstawOsobyDoTablicy();
        wyswietlOsoby();
        wyswietlPracownikowNadgodziny();
        wyswietlCzytelnikowWypozyczenia();
        policzBibliotekarzy();
        ktoryPracownikZarobilNajwiecej();
    }

    private static void wstawOsobyDoTablicy() {
        osoby[0] = new Czytelnik("naz", "92873298", 3);
        osoby[1] = new Pracownik("n", "321213", "bibliotekarz", 3000, 25);
        osoby[2] = new Czytelnik("nnnnnn", "1623817", 1);
        osoby[3] = new Pracownik("nnnn", "126371", "bibliotekarz", 3500, 28);
        osoby[4] = new Czytelnik();
        osoby[5] = new Pracownik();
        n = 6;
    }

    private static void wyswietlOsoby() {
        for (int i = 0; i < n; i++) {
            System.out.println(osoby[i].toString());
        }
    }

    private static void wyswietlPracownikowNadgodziny() {
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (osoby[i] instanceof Pracownik) {
                System.out.println();
                System.out.println(osoby[i].toString());
                ((Pracownik) osoby[i]).wyswietlLiczbeNadgodzin();
            }
        }
    }

    private static void wyswietlCzytelnikowWypozyczenia() {
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (osoby[i] instanceof Czytelnik) {
                System.out.println();
                System.out.println(osoby[i].toString());
                ((Czytelnik) osoby[i]).wyswietlWypozyczenia();
            }
        }
    }

    private static void policzBibliotekarzy() {
        int lBibliotekarzy = 0;
        for (int i = 0; i < n; i++) {
            if (osoby[i] instanceof Pracownik) {
                if (((Pracownik) osoby[i]).jestBibliotekarzem()) {
                    lBibliotekarzy +=1;
                }
            }
        }
        System.out.println("\n\nLiczba bibliotekarzy: " + lBibliotekarzy);
    }

    private static void ktoryPracownikZarobilNajwiecej() {
        int najwiekszyZarobek = -1;
        int indeksPracownika = 0;
        for (int i = 0; i < n; i++) {
            if (osoby[i] instanceof Pracownik) {
                if (osoby[i].oblicz() > najwiekszyZarobek) {
                    najwiekszyZarobek = (int) osoby[i].oblicz();
                    indeksPracownika = i;
                }
            }
        }
        System.out.println("\n\nNajwiecej (" + najwiekszyZarobek + ") zarobil pracownik na stanowisku " +
                ((Pracownik) osoby[indeksPracownika]).getS() + " (" + osoby[indeksPracownika].toString() + ")");

    }
}
