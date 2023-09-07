package Prog;

import Wielomian.Wielomian;

public class Prog {
    public static void main(String[] args) {
        int n = 5;
        double x = 2;
        double wynik = Wielomian.Hermite(n, x);
        System.out.println(wynik);
    }
}