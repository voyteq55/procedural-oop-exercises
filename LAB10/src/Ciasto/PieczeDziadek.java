package Ciasto;

import java.io.Serializable;

public class PieczeDziadek extends Ciasto implements Serializable {
    public PieczeDziadek(String nazwaCiasta) {
        super(nazwaCiasta);
    }

    public void wyswietlInfo() {
        System.out.println("dziadek piecze " + nazwaCiasta + ", " + getAlgorytmInfoJablko() + getAlgorytmInfoSliwka());
    }
}
