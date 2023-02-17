public class Prostopadloscian extends Bryla {
    private int a;
    private int b;

    public Prostopadloscian() {
        super("Bazowy", 1);
        this.a = 1;
        this.b = 1;
    }

    public Prostopadloscian(String nazwa, int h, int a, int b) {
        super(nazwa, h);
        this.a = a;
        this.b = b;
    }

    @Override
    public double objetosc() {
        return a * b * getH();
    }

    @Override
    public double pole() {
        return 2 * (a * b + a * getH() + b * getH());
    }

    @Override
    public String toString() {
        return "Prostopadloscian: " + getNazwa() + " [a=" + a + ", b=" + b + ", h=" + getH() + "]";
    }

    public boolean jestSzescianem() {
        return (a==b && a==getH());
    }
}
