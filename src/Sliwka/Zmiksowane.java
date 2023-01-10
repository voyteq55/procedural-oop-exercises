package Sliwka;

import java.io.Serializable;

public class Zmiksowane implements Sliwka, Serializable {

    @Override
    public String przygotowanieSliwki() {
        return "sliwki zmiksowane";
    }
}
