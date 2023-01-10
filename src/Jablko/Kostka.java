package Jablko;

import java.io.Serializable;

public class Kostka implements Jablko, Serializable {

    @Override
    public String przygotowanieJablka() {
        return "jablka pokrojone w kostki";
    }
}
