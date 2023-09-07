package Bukiet;

import Florysta.Florysta;

public class Bukiet {
    private Kwiat kwiat;
    private boolean dostepny = false;

    public Bukiet() {
        kwiat = new Kwiat();
    }

    public Bukiet(Kwiat kwiat) {
        this.kwiat = kwiat;
    }

    public Kwiat getKwiat() {
        return kwiat;
    }

    public void setKwiat(Kwiat kwiat) {
        this.kwiat = kwiat;
    }

    public boolean getDostepny() {
        return dostepny;
    }

    public void setDostepny(boolean dostepny) {
        this.dostepny = dostepny;
    }

    public String getStan() {
        return "nazwa kwiatu: " + kwiat.getNazwa() + ", dostepny: " + dostepny;
    }

    public void jestwKwiaciarni() {
        Florysta.tworzBukiet(this);
    }

    public void brakwKwiaciarni() {
        Florysta.sprzedajBukiet(this);
    }
}
