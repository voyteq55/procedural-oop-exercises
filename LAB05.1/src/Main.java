public class Main {
    public static void main(String[] args) {
        Zegar zegar1 = new Zegar();
        zegar1.wypisz();
        zegar1.przesun(5, 6, 38);
        zegar1.wypisz();
        zegar1.przesun(22, 45, 56);
        zegar1.wypisz();

        Zegar zegar2 = new Zegar(17, 49, 18);
        zegar2.wypisz();
        zegar2.przesun(12, 54, 11);
        zegar2.wypisz();
    }
}
