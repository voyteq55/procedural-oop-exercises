public abstract class Auto {
    protected String marka;
    protected int liczbaKilometrow;
    protected long nrNadwozia;
    protected boolean diesel;

    public Auto() {
        this.marka = "";
        this.liczbaKilometrow = 0;
        this.nrNadwozia = 0L;
        this.diesel = false;
    }

    public Auto(String marka, int liczbaKilometrow, long nrNadwozia, boolean diesel) {
        this.marka = marka;
        this.liczbaKilometrow = liczbaKilometrow;
        this.nrNadwozia = nrNadwozia;
        this.diesel = diesel;
    }

    public String toString() {
        return marka + " (" + liczbaKilometrow + " km), nr nadwozia: " + nrNadwozia + ", " + (diesel ? "diesel" : "benzyna");
    }

    public String getMarka() {
        return marka;
    }

    public int getLiczbaKilometrow() {
        return liczbaKilometrow;
    }

    public long getNrNadwozia() {
        return nrNadwozia;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public abstract double ilePaliwa();
}
