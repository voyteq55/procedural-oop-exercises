public abstract class Bryla {
    private String nazwa;
    private int h;

    public Bryla() {
        nazwa = "";
        h = 0;
    }

    public Bryla(String nazwa, int h) {
        this.nazwa = nazwa;
        this.h = h;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getH() {
        return h;
    }

    public String toString() {
        return "Bryla o nazwie: " + nazwa;
    }

    public abstract double objetosc();
    public abstract double pole();
}
