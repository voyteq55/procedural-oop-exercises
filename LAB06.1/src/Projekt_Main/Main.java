package Projekt_Main;

import Bukiet.Bukiet;
import Bukiet.Kwiat;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bukiet[] kwiaciarnia = new Bukiet[4];
        Random random = new Random();
        for (int i = 0; i < kwiaciarnia.length; i++) {
            kwiaciarnia[i] = new Bukiet(new Kwiat(random.nextInt(6) + 1));
        }
        wyswietlBukiety(kwiaciarnia);

        kwiaciarnia[1].jestwKwiaciarni();
        kwiaciarnia[2].jestwKwiaciarni();

        System.out.println("\nbukiety po stworzeniu bukietow");
        wyswietlBukiety(kwiaciarnia);

        kwiaciarnia[1].brakwKwiaciarni();
        kwiaciarnia[2].brakwKwiaciarni();

        System.out.println("\nbukiety po sprzedaniu bukietow");
        wyswietlBukiety(kwiaciarnia);
    }

    private static void wyswietlBukiety(Bukiet[] kwiaciarnia) {
        for (int i = 0; i < kwiaciarnia.length; i++) {
            System.out.println("Bukiet o indeksie=" + i + " kwiat=" + kwiaciarnia[i].getKwiat().getNazwa() + " dostepny=" + kwiaciarnia[i].getDostepny());
        }
    }
}
