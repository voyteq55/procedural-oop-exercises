public class Zegar {
    private int sekundyTotal;

    public Zegar() {
        sekundyTotal = 0;
    }

    public Zegar(int hh, int mm, int ss) {
        if ((ss < 0) || (ss > 59) || (mm < 0) || (mm > 59) || (hh < 0) || (hh > 23)) {
            this.sekundyTotal = 0;
        } else {
            sekundyTotal = 3600 * hh + 60 * mm + ss;
        }
    }

    public void przesun(int hh, int mm, int ss)  {
        sekundyTotal = (sekundyTotal + 3600 * hh + 60 * mm + ss) % 86400;
    }

    public void wypisz() {
        int ss = sekundyTotal % 60;
        int mm = (sekundyTotal / 60) % 60;
        int hh = sekundyTotal / 3600;
        System.out.printf("Czas: %02d:%02d:%02d (uplynelo %d sekund od polnocy)\n", hh, mm, ss, sekundyTotal);
    }

}
