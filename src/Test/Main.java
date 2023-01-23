package Test;

import Obserwatorzy.TermometrAnalogowy;
import Obserwatorzy.TermometrElektroniczny;
import Obserwowalny.Temperatura;

public class Main {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura(52.68);
        temperatura.dodajTermometr(new TermometrAnalogowy());
        temperatura.dodajTermometr(new TermometrElektroniczny());

        temperatura.zwiekszTemperature(2);
        temperatura.zwiekszTemperature(10);
    }
}
