public class Walec extends Bryla {
    private int r;

    public Walec() {
        super("Bazowy", 1);
        this.r = 1;
    }

    public Walec(String nazwa, int h, int r) {
        super(nazwa, h);
        this.r = r;
    }

    @Override
    public double objetosc() {
        return Math.PI * r * r * getH();
    }

    @Override
    public double pole() {
        return 2 * Math.PI * r * (r + getH());
    }

    @Override
    public String toString() {
        return "Walec: " + getNazwa() + " [r=" + r + ", h=" + getH() + "]";
    }

    public boolean obrotKwadratu() {
        return r == getH();
    }
}
