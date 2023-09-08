package Sklep;

import Karta.KartaKlienta;
import Karta.KartaPodstawowa;
import Karta.KartaSeniora;
import Karta.KartaStudenta;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sklep {
    private static Transakcja[] listaTransakcji;
    private static Scanner scanner;

    public static void main(String[] args) {
        listaTransakcji = new Transakcja[100];
        scanner = new Scanner(System.in);
        int wybranaOpcja = wyswietlMenu();

        while (wybranaOpcja != 0) {
            switch (wybranaOpcja) {
                case 1:
                    dodajTransakcje();
                    break;
                case 2:
                    dodajKilkaTransakcji();
                    break;
                case 3:
                    wyswietlTransakcje();
                    break;
                case 4:
                    policzTransakcjeSeniorow();
                    break;
                case 5:
                    wyswietlNajwiecejPlacacegoStudenta();
                    break;
                case 6:
                    zapiszTransakcjeKartyStudentaDoPliku();
                    break;
                default:
                    System.out.println("Wybrana opcja nie istnieje");
            }

            wybranaOpcja = wyswietlMenu();
        }
    }

    private static int wyswietlMenu() {
        System.out.println("\n------Sklep------");
        System.out.println("Wybierz opcje:");
        System.out.println("1 - dodaj transakcje");
        System.out.println("2 - wstaw kilka transakcji");
        System.out.println("3 - wyswietl transakcje");
        System.out.println("4 - policz transakcje z karta seniora");
        System.out.println("5 - wyswietl najwiecej placacego studenta");
        System.out.println("6 - zapisz transakcje karty studenta do pliku");
        System.out.println("0 - zakoncz program");
        System.out.print("Wpisz nr opcji: ");
        return wpiszLiczbeCalkowitaNieujemna();
    }

    private static void dodajTransakcje() {
        System.out.println("Dodawanie transakcji");
        System.out.print("Wpisz nr karty klienta: ");
        int numerKarty = wpiszLiczbeCalkowitaNieujemna();
        System.out.print("Wpisz nazwisko klienta: ");
        String nazwisko = scanner.next();
        System.out.print("Wpisz rodzaj karty (1 - podstawowa, 2 - student, 3 - senior): ");
        int numerWybranejOpcjiKarty = wpiszLiczbeCalkowitaNieujemna();

        KartaKlienta karta;
        switch (numerWybranejOpcjiKarty) {
            case 2:
                karta = new KartaStudenta(numerKarty, nazwisko);
                break;
            case 3:
                karta = new KartaSeniora(numerKarty, nazwisko);
                break;
            default:
                karta = new KartaPodstawowa(numerKarty, nazwisko);
                break;
        }

        System.out.print("Wpisz kwote transakcji (przed rabatem): ");
        double kwota = wpiszLiczbeRzeczywistaNieujemna();

        Transakcja transakcja = new Transakcja(kwota, karta);
        listaTransakcji[Transakcja.liczbaTransakcji() - 1] = transakcja;
        System.out.println("Transakcja dodana pomyslnie");
    }

    private static void dodajKilkaTransakcji() {
        System.out.print("Wpisz liczbe transakcji do dodania: ");
        int liczbaTransakcjiDoDodania = wpiszLiczbeCalkowitaNieujemna();
        for (int i = 0; i < liczbaTransakcjiDoDodania; i++) {
            System.out.println("\nnr " + (i + 1));
            dodajTransakcje();
        }
    }

    private static void wyswietlTransakcje() {
        if (Transakcja.liczbaTransakcji() > 0) {
            System.out.println("Lista transakcji:");
            for (int i = 0; i < Transakcja.liczbaTransakcji(); i++) {
                System.out.println((i + 1) + ". " + listaTransakcji[i].toString());
            }
        } else {
            System.out.println("Brak transakcji do wyswietlenia");
        }
    }

    private static void policzTransakcjeSeniorow() {
        int liczbaTransakcjiSeniorow = 0;
        for (int i = 0; i < Transakcja.liczbaTransakcji(); i++) {
            if (listaTransakcji[i].getKarta() instanceof KartaSeniora) {
                liczbaTransakcjiSeniorow++;
            }
        }
        System.out.println("\nLiczba transkacji odbytych przy uzyciu KartySeniora: " + liczbaTransakcjiSeniorow);
    }

    private static void wyswietlNajwiecejPlacacegoStudenta() {
        int indeksNajwiecejPlacacegoStudenta = -1;
        double najwiekszaKwotaDoZaplaty = 0;
        for (int i = 0; i < Transakcja.liczbaTransakcji(); i++) {
            if (listaTransakcji[i].getKarta() instanceof KartaStudenta) {
                if (listaTransakcji[i].kwotaDoZaplaty() > najwiekszaKwotaDoZaplaty) {
                    najwiekszaKwotaDoZaplaty = listaTransakcji[i].kwotaDoZaplaty();
                    indeksNajwiecejPlacacegoStudenta = i;
                }
            }
        }
        if (indeksNajwiecejPlacacegoStudenta >= 0) {
            System.out.println("\nStudent, ktory zaplacil najwiecej (" + najwiekszaKwotaDoZaplaty + "): "
                    + listaTransakcji[indeksNajwiecejPlacacegoStudenta].getKarta().toString());
        } else {
            System.out.println("\nBrak transakcji studentow");
        }
    }

    private static void zapiszTransakcjeKartyStudentaDoPliku() {
        File file = new File("././transakcjeKartyStudenta.txt");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < Transakcja.liczbaTransakcji(); i++) {
                if (listaTransakcji[i].getKarta() instanceof KartaStudenta) {
                    writer.write(listaTransakcji[i].toString() + System.getProperty("line.separator"));
                }
            }
        } catch (IOException e) {
            System.out.println("Nie udalo sie zapisac danych do pliku");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("Blad przy zamykaniu pliku");
            } catch (NullPointerException e) {
                System.out.println("Nie otworzono pliku");
            }
        }
    }

    private static int wpiszLiczbeCalkowitaNieujemna() {
        String input = scanner.next();
        try {
            int liczba = Integer.parseInt(input);
            if (liczba < 0) {
                System.out.print("\nNieprawidlowy input, wpisz liczbe calkowita nieujemna: ");
                liczba = wpiszLiczbeCalkowitaNieujemna();
            }
            return liczba;
        } catch (NumberFormatException e) {
            System.out.print("\nNieprawidlowy input, wpisz liczbe calkowita: ");
            return wpiszLiczbeCalkowitaNieujemna();
        }
    }

    private static double wpiszLiczbeRzeczywistaNieujemna() {
        String input = scanner.next();
        try {
            double liczba = Double.parseDouble(input);
            if (liczba < 0) {
                System.out.print("\nNieprawidlowy input, wpisz liczbe nieujemna: ");
                liczba = wpiszLiczbeRzeczywistaNieujemna();
            }
            return liczba;
        } catch (NumberFormatException e) {
            System.out.print("\nNieprawidlowy input, wpisz liczbe: ");
            return wpiszLiczbeRzeczywistaNieujemna();
        }
    }
}
