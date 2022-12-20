package Ciasto;

public class PieczeBabcia extends Ciasto {
    public PieczeBabcia(String nazwaCiasta) {
        super(nazwaCiasta);
    }

    public void wyswietlInfo() {
        System.out.println("babcia piecze " + nazwaCiasta + ", " + getAlgorytmInfoJablko() + getAlgorytmInfoSliwka());
    }
}
