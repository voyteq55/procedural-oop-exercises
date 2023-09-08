package Ciasto;

import Jablko.Jablko;
import Sliwka.Sliwka;

import java.io.Serializable;

public abstract class Ciasto implements Serializable {
    private String algorytmInfoJablko = "";
    private String algorytmInfoSliwka = "";
    protected String nazwaCiasta;
    private Jablko strategiaJablko;
    private Sliwka strategiaSliwka;

    public Ciasto(String nazwaCiasta) {
        this.nazwaCiasta = nazwaCiasta;
    }

    public void ustawSzarlotke(Jablko strategia) {
        this.strategiaJablko = strategia;
    }

    public void wykonajSzarlotke() {
        this.algorytmInfoJablko = strategiaJablko.przygotowanieJablka();
    }

    public void ustawCiastoSliwkowe(Sliwka strategia) {
        this.strategiaSliwka = strategia;
    }

    public void wykonajCiastoSliwkowe() {
        this.algorytmInfoSliwka = strategiaSliwka.przygotowanieSliwki();
    }

    public String getAlgorytmInfoJablko() {
        return algorytmInfoJablko;
    }

    public void setAlgorytmInfoJablko(String algorytmInfoJablko) {
        this.algorytmInfoJablko = algorytmInfoJablko;
    }

    public String getAlgorytmInfoSliwka() {
        return algorytmInfoSliwka;
    }

    public void setAlgorytmInfoSliwka(String algorytmInfoSliwka) {
        this.algorytmInfoSliwka = algorytmInfoSliwka;
    }

    public abstract void wyswietlInfo();
}
