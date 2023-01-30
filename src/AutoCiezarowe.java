public class AutoCiezarowe extends Auto{
    private String model;
    private double zuzycie;
    private boolean kratka;

    public AutoCiezarowe() {
        super();
        model = "";
        zuzycie = 0;
        kratka = false;
    }

    public AutoCiezarowe(String marka, int liczbaKilometrow, long nrNadwozia, boolean diesel, String model, double zuzycie, boolean kratka) {
        super(marka, liczbaKilometrow, nrNadwozia, diesel);
        this.model = model;
        this.zuzycie = zuzycie;
        this.kratka = kratka;
    }

    @Override
    public String toString() {
        return super.toString() + ", model " + model + ", zuzycie: " + zuzycie + (kratka ? ", posiada kratke" : ", nie posiada kratki");
    }

    @Override
    public double ilePaliwa() {
        return this.zuzycie / this.liczbaKilometrow;
    }

    public String getModel() {
        return model;
    }

    public double getZuzycie() {
        return zuzycie;
    }

    public boolean isKratka() {
        return kratka;
    }
}
