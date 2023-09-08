public class AutoOsobowe extends Auto{
    private String model;
    private double zuzycie;

    public AutoOsobowe() {
        super();
        model = "";
        zuzycie = 0;
    }

    public AutoOsobowe(String marka, int liczbaKilometrow, long nrNadwozia, boolean diesel, String model, double zuzycie) {
        super(marka, liczbaKilometrow, nrNadwozia, diesel);
        this.model = model;
        this.zuzycie = zuzycie;
    }

    @Override
    public String toString() {
        return super.toString() + ", model " + model + ", zuzycie: " + zuzycie;
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
}
