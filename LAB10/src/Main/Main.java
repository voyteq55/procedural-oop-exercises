package Main;

import Ciasto.PieczeBabcia;
import Ciasto.PieczeDziadek;
import Ciasto.Ciasto;
import Jablko.Cwiartki;
import Jablko.Kostka;
import Sliwka.Polowki;
import Sliwka.Zmiksowane;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int wybranaOpcja = wyswietlMenu();

        ArrayList<Ciasto> listaCiast = odczytajSerializowaneCiasta();
        if (listaCiast == null) {
            listaCiast = new ArrayList<>();
        }

        while (wybranaOpcja != 0) {
            switch (wybranaOpcja) {
                case 1:
                    Ciasto ciasto1 = new PieczeBabcia("szarlotke");
                    ciasto1.ustawSzarlotke(new Kostka());
                    ciasto1.wykonajSzarlotke();
                    ciasto1.wyswietlInfo();
                    listaCiast.add(ciasto1);
                    break;
                case 2:
                    Ciasto ciasto2 = new PieczeBabcia("szarlotke");
                    ciasto2.ustawSzarlotke(new Cwiartki());
                    ciasto2.wykonajSzarlotke();
                    ciasto2.wyswietlInfo();
                    listaCiast.add(ciasto2);
                    break;
                case 3:
                    Ciasto ciasto3 = new PieczeBabcia("ciasto sliwkowe");
                    ciasto3.ustawCiastoSliwkowe(new Zmiksowane());
                    ciasto3.wykonajCiastoSliwkowe();
                    ciasto3.wyswietlInfo();
                    listaCiast.add(ciasto3);
                    break;
                case 4:
                    Ciasto ciasto4 = new PieczeBabcia("ciasto sliwkowe");
                    ciasto4.ustawCiastoSliwkowe(new Polowki());
                    ciasto4.wykonajCiastoSliwkowe();
                    ciasto4.wyswietlInfo();
                    listaCiast.add(ciasto4);
                    break;
                case 5:
                    Ciasto ciasto5 = new PieczeDziadek("szarlotke");
                    ciasto5.ustawSzarlotke(new Kostka());
                    ciasto5.wykonajSzarlotke();
                    ciasto5.wyswietlInfo();
                    listaCiast.add(ciasto5);
                    break;
                case 6:
                    Ciasto ciasto6 = new PieczeDziadek("szarlotke");
                    ciasto6.ustawSzarlotke(new Cwiartki());
                    ciasto6.wykonajSzarlotke();
                    ciasto6.wyswietlInfo();
                    listaCiast.add(ciasto6);
                    break;
                case 7:
                    Ciasto ciasto7 = new PieczeDziadek("ciasto sliwkowe");
                    ciasto7.ustawCiastoSliwkowe(new Zmiksowane());
                    ciasto7.wykonajCiastoSliwkowe();
                    ciasto7.wyswietlInfo();
                    listaCiast.add(ciasto7);
                    break;
                case 8:
                    Ciasto ciasto8 = new PieczeDziadek("ciasto sliwkowe");
                    ciasto8.ustawCiastoSliwkowe(new Polowki());
                    ciasto8.wykonajCiastoSliwkowe();
                    ciasto8.wyswietlInfo();
                    listaCiast.add(ciasto8);
                    break;
                case 9:
                    wyswietlZapisaneCiasta(listaCiast);
                    break;
            }

            wybranaOpcja = wyswietlMenu();
        }

        // ten kod wykonuje sie tuz przed zakonczeniem programu (po wpisaniu '0' przez uzytkownika), zapisuje wszystkie
        // ciasta do pliku .ser za pomoca ArrayListy

        serializujCiasta(listaCiast);
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
        System.out.println("9 - wyswiel wszystkie zapisane ciasta");
        System.out.println("0 - zakoncz program");
        System.out.print("wpisz nr wybranej opcji: ");
        return scanner.nextInt();
    }

    private static void serializujCiasta(ArrayList<Ciasto> listaCiast) {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("ciasta.ser"));
            outputStream.writeObject(listaCiast);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                 outputStream.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    private static ArrayList<Ciasto> odczytajSerializowaneCiasta() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ciasta.ser"));
            Object odczytanyObiekt = inputStream.readObject();
            return (ArrayList<Ciasto>) odczytanyObiekt;
//            ArrayList<Ciasto> odczytanaLista = (ArrayList<Ciasto>) odczytanyObiekt;
//            if (odczytanaLista != null) {
//                listaCiast = odczytanaLista;
//            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void wyswietlZapisaneCiasta(ArrayList<Ciasto> listaCiast) {
        for (int i = 0; i < listaCiast.size(); i++) {
            listaCiast.get(i).wyswietlInfo();
        }
    }

}
