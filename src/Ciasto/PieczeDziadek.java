package Ciasto;

public class PieczeDziadek extends Ciasto {
    public PieczeDziadek(String nazwaCiasta) {
        super(nazwaCiasta);
    }

    public void wyswietlInfo() {
        System.out.println("dziadek piecze " + nazwaCiasta + ", " + getAlgorytmInfoJablko() + getAlgorytmInfoSliwka());
    }
}
