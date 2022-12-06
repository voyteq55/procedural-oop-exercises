public class Ksiazka {
    private int sygnatura;
    private double kara;
    private boolean zwrot;

    public Ksiazka() {
        sygnatura = 0;
        kara = 0;
        zwrot = true;
    }

    public Ksiazka(int sygnatura, double kara, boolean zwrot) {
        this.sygnatura = sygnatura;
        this.kara = kara;
        this.zwrot = zwrot;
        if (this.zwrot) kara = 0;
    }

    public double getKara() {
        return kara;
    }

    @Override
    public String toString() {
        return sygnatura + ", kara:  " + kara + ", oddana w terminie: " + zwrot;
    }
}
