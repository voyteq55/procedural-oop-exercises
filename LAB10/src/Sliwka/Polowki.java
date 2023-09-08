package Sliwka;

import java.io.Serializable;

public class Polowki implements Sliwka, Serializable {

    @Override
    public String przygotowanieSliwki() {
        return "sliwki podzielone na polowki";
    }
}
