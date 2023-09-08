package Karta;

public abstract class KartaKlienta {
    private int numer;
    private String nazwisko;

    public KartaKlienta() {
        numer = 0;
        nazwisko = null;
    }

    public KartaKlienta(int numer, String nazwisko) {
        this.numer = numer;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "nr " + numer + ", nazwisko " + nazwisko;
    }

    public abstract double rabat();
}
