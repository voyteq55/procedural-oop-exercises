package Main;

import Ciasto.PieczeBabcia;
import Ciasto.PieczeDziadek;
import Ciasto.Ciasto;
import Jablko.Cwiartki;
import Jablko.Kostka;
import Sliwka.Polowki;
import Sliwka.Zmiksowane;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int wybranaOpcja = wyswietlMenu();
        while (wybranaOpcja != 0) {
            Ciasto ciasto = null;
            switch (wybranaOpcja) {
                case 1:
                    ciasto = new PieczeBabcia("szarlotke");
                    ciasto.ustawSzarlotke(new Kostka());
                    ciasto.wykonajSzarlotke();
                    ciasto.wyswietlInfo();
                    break;
                case 2:
                    ciasto = new PieczeBabcia("szarlotke");
                    ciasto.ustawSzarlotke(new Cwiartki());
                    ciasto.wykonajSzarlotke();
                    ciasto.wyswietlInfo();
                    break;
                case 3:
                    ciasto = new PieczeBabcia("ciasto sliwkowe");
                    ciasto.ustawCiastoSliwkowe(new Zmiksowane());
                    ciasto.wykonajCiastoSliwkowe();
                    ciasto.wyswietlInfo();
                    break;
                case 4:
                    ciasto = new PieczeBabcia("ciasto sliwkowe");
                    ciasto.ustawCiastoSliwkowe(new Polowki());
                    ciasto.wykonajCiastoSliwkowe();
                    ciasto.wyswietlInfo();
                    break;
                case 5:
                    ciasto = new PieczeDziadek("szarlotke");
                    ciasto.ustawSzarlotke(new Kostka());
                    ciasto.wykonajSzarlotke();
                    ciasto.wyswietlInfo();
                    break;
                case 6:
                    ciasto = new PieczeDziadek("szarlotke");
                    ciasto.ustawSzarlotke(new Cwiartki());
                    ciasto.wykonajSzarlotke();
                    ciasto.wyswietlInfo();
                    break;
                case 7:
                    ciasto = new PieczeDziadek("ciasto sliwkowe");
                    ciasto.ustawCiastoSliwkowe(new Zmiksowane());
                    ciasto.wykonajCiastoSliwkowe();
                    ciasto.wyswietlInfo();
                    break;
                case 8:
                    ciasto = new PieczeDziadek("ciasto sliwkowe");
                    ciasto.ustawCiastoSliwkowe(new Polowki());
                    ciasto.wykonajCiastoSliwkowe();
                    ciasto.wyswietlInfo();
                    break;
            }

            wybranaOpcja = wyswietlMenu();
        }
    }

    private static int wyswietlMenu() {
        System.out.println("Menu:");
        System.out.println("1 - babcia piecze szarlotke (kostki)");
        System.out.println("2 - babcia piecze szarlotke (cwiartki)");
        System.out.println("3 - babcia piecze ciasto sliwkowe (zmiksowane)");
        System.out.println("4 - babcia piecze ciasto sliwkowe (polowki)");
        System.out.println("5 - dziadek piecze szarlotke (kostki)");
        System.out.println("6 - dziadek piecze szarlotke (cwiartki)");
        System.out.println("7 - dziadek piecze ciasto sliwkowe (zmiksowane)");
        System.out.println("8 - dziadek piecze ciasto sliwkowe (polowki)");
        System.out.println("0 - zakoncz program");
        System.out.print("wpisz nr wybranej opcji: ");
        return scanner.nextInt();
    }
}
