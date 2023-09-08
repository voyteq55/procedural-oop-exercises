package Obserwatorzy;

import Obserwowalny.Temperatura;

public class TermometrAnalogowy implements ObserwowalnyTerm {
    @Override
    public void zaktualizujTemperature(Temperatura temperatura) {
        System.out.println("Termometr analogowy:");
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%s\n", "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100");
        double temp = temperatura.getStopnieCelsjusza();
        for (int i = 0; i <= 100; i+=2) {
            if (i <= temp) {
                System.out.print("\u25A8");
            } else if (i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
