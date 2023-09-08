package Sklep;

import Karta.KartaKlienta;

public class Transakcja {
    private static int numerTransakcji = 0;
    private double kwota;
    private KartaKlienta karta;

    public Transakcja() {
        numerTransakcji++;
    }

    public Transakcja(double kwota, KartaKlienta karta) {
        this();
        this.kwota = kwota;
        this.karta = karta;
    }

    public KartaKlienta getKarta() {
        return karta;
    }

    @Override
    public String toString() {
        return "Transakcja - kwota: " + kwota + ", klient " + karta.toString();
    }

    public double kwotaDoZaplaty() {
        return kwota - karta.rabat() * kwota;
    }

    public static int liczbaTransakcji() {
        return numerTransakcji;
    }
}
