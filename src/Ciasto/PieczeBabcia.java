package Ciasto;

import java.io.Serializable;

public class PieczeBabcia extends Ciasto implements Serializable {
    public PieczeBabcia(String nazwaCiasta) {
        super(nazwaCiasta);
    }

    public void wyswietlInfo() {
        System.out.println("babcia piecze " + nazwaCiasta + ", " + getAlgorytmInfoJablko() + getAlgorytmInfoSliwka());
    }
}
