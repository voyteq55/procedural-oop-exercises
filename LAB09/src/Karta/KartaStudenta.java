package Karta;

public class KartaStudenta extends KartaKlienta {

    public KartaStudenta() {
        super();
    }

    public KartaStudenta(int numer, String nazwisko) {
        super(numer, nazwisko);
    }

    @Override
    public String toString() {
        return super.toString() + ", student";
    }

    @Override
    public double rabat() {
        return 0.1;
    }
}
