package Obserwatorzy;

import Obserwowalny.Temperatura;

public class TermometrElektroniczny implements ObserwowalnyTerm {
    @Override
    public void zaktualizujTemperature(Temperatura temperatura) {
        System.out.printf("Termometr elektroniczny pokazuje teraz temperature %.2f stopni Celsjusza\n", temperatura.getStopnieCelsjusza());
    }
}
