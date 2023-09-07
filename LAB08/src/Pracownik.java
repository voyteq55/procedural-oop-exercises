import java.util.Random;

public class Pracownik extends Osoba {
    private String s;
    private int pensja;
    private int stawka;
    private int[] t;

    public Pracownik() {
        super();
        s = "brak";
        pensja = 0;
        stawka = 0;
        t = null;
    }

    public Pracownik(String nazwisko, String pesel, String stan, int pensja, int stawka) {
        super(nazwisko, pesel);
        this.s = stan;
        this.pensja = pensja;
        this.stawka = stawka;
        t = new int[6];
        Random r = new Random();
        for (int i = 0; i < t.length; i++) {
            t[i] = r.nextInt(5);
        }
    }

    public String getS() {
        return s;
    }

    @Override
    public double oblicz() {
        int lNadgodzin = 0;
        if (t != null) {
            for (int i = 0; i < t.length; i++) {
                lNadgodzin += t[i];
            }
        }
        return pensja + (stawka * lNadgodzin);
    }

    @Override
    public String toString() {
        return "Pracownik: " + super.toString() + " [stanowisko=" + s + ", pensja=" + pensja + ",stawka=" + stawka + "]";
    }

    public void wyswietlLiczbeNadgodzin() {
        String[] dniTygodnia = {"poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota"};
        if (t != null) {
            for (int i = 0; i < t.length; i++) {
                System.out.println("Godziny wypracowane w " + dniTygodnia[i] + ": " + t[i]);
            }
        }
    }

    public boolean jestBibliotekarzem() {
        return s.equals("bibliotekarz");
    }
}
