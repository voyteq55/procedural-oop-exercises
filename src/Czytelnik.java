public class Czytelnik extends Osoba {
    private int n;
    private Ksiazka[] wypozyczenia;

    public Czytelnik() {
        super();
        n = 0;
        wypozyczenia = null;
    }

    public Czytelnik(String nazwisko, String pesel, int n) {
        super(nazwisko, pesel);
        this.n = n;
        wypozyczenia = new Ksiazka[n];
        for (int i = 0; i < n; i++) {
            wypozyczenia[i] = new Ksiazka(12345, 0, true);
        }
    }

    @Override
    public double oblicz() {
        double sumaKar = 0;
        for (int i = 0; i < n; i++) {
            sumaKar += wypozyczenia[i].getKara();
        }
        return sumaKar;
    }

    @Override
    public String toString() {
        return "Czytelnik: " + nazwisko + " pesel: " + pesel + " [n=" + n + "]";
    }

    public void wyswietlWypozyczenia() {
        System.out.println("Wypozyczenia:");
        for (int i = 0; i < n; i++) {
            System.out.println(wypozyczenia[i].toString());
        }
    }
}
