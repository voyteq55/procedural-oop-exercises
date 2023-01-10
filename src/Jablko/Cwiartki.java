package Jablko;

import java.io.Serializable;

public class Cwiartki implements Jablko, Serializable {

    @Override
    public String przygotowanieJablka() {
        return "jablka pokrojone w cwiartki";
    }
}
