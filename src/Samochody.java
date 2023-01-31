import java.util.*;

public class Samochody {
    private static Scanner scanner;
   private static Samochody auta;
    private ArrayList<Auto> samochody;
    private Comparator<Auto> sposobSortowania;

    public Samochody() {
        this.samochody = new ArrayList<>();
    }

    public Samochody(Auto[] samochody) {
        this.samochody = new ArrayList<>(Arrays.asList(samochody));
    }

    public void dodajSamochodOsobowy(String marka, int liczbaKilometrow, long nrNadwozia, boolean diesel, String model, double zuzycie) {
        samochody.add(new AutoOsobowe(marka, liczbaKilometrow, nrNadwozia, diesel, model, zuzycie));
    }

    public void dodajSamochodCiezarowy(String marka, int liczbaKilometrow, long nrNadwozia, boolean diesel, String model, double zuzycie, boolean kratka) {
        samochody.add(new AutoCiezarowe(marka, liczbaKilometrow, nrNadwozia, diesel, model, zuzycie, diesel));
    }

    public void wyswietlWszystkieAuta() {
        System.out.println("Samochody:");
        for (Auto auto : samochody) {
            System.out.println(auto);
        }
    }

    public void ustawSposobSortowania(Comparator<Auto> sposobSortowania) {
        this.sposobSortowania = sposobSortowania;
    }

    public void posortujOrazWyswietlSamochody() {
        samochody.sort(sposobSortowania);
        System.out.println(sposobSortowania);
        this.wyswietlWszystkieAuta();
    }

    public void wyswietlNajwiekszeZuzycie() {
        System.out.println("\nSamochod o najwiekszym zuzyciu paliwa na kilometr: ");
        Iterator<Auto> iterator = samochody.iterator();
        if (iterator.hasNext()) {
            Auto autoZNajwiekszymZuzyciem = iterator.next();
            double najwiekszeZuzyciePaliwa = autoZNajwiekszymZuzyciem.ilePaliwa();
            int pozycjaSamochoduNajwiekszeZuzycie = 0;
            int indeks = 1;
            while (iterator.hasNext()) {
                Auto samochodTemp = iterator.next();
                if (samochodTemp.ilePaliwa() > najwiekszeZuzyciePaliwa) {
                    najwiekszeZuzyciePaliwa = samochodTemp.ilePaliwa();
                    autoZNajwiekszymZuzyciem = samochodTemp;
                    pozycjaSamochoduNajwiekszeZuzycie = indeks;
                }
                indeks++;
            }

            System.out.println("(" + najwiekszeZuzyciePaliwa + " l/km) pozycja " + pozycjaSamochoduNajwiekszeZuzycie + ": " + autoZNajwiekszymZuzyciem);
        } else {
            System.out.println("Brak informacji do wyswietlenia");
        }

    }

    static class SortujWedlugMarek implements Comparator<Auto> {
        @Override
        public int compare(Auto auto1, Auto auto2) {
            return auto1.getMarka().compareTo(auto2.getMarka());
        }

        @Override
        public String toString() {
            return "\nPosortowane wedlug marek:";
        }
    }

    static class SortujWedlugLiczbyKilometrow implements Comparator<Auto> {
        @Override
        public int compare(Auto auto1, Auto auto2) {
            return Integer.compare(auto1.getLiczbaKilometrow(), auto2.getLiczbaKilometrow());
        }

        @Override
        public String toString() {
            return "\nPosortowane wedlug liczby kilometrow:";
        }
    }

    static class SortujWedlugMarekPotemLiczbyKilometrow implements Comparator<Auto> {
        @Override
        public int compare(Auto auto1, Auto auto2) {
            if (auto1.getMarka().equals(auto2.getMarka())) {
                return Integer.compare(auto1.getLiczbaKilometrow(), auto2.getLiczbaKilometrow());
            }
            return auto1.getMarka().compareTo(auto2.getMarka());
        }

        @Override
        public String toString() {
            return "\nPosortowane wedlug marek, a potem liczby kilometrow:";
        }
    }


    public static void main(String[] args) {
//        Samochody auta = new Samochody();
//        auta.dodajSamochodOsobowy("Fiat", 10000, 1236182736, false, "Punto", 1231);
//        auta.dodajSamochodCiezarowy("AAA", 20000, 45246136, false, "BBB", 1790, true);
//        auta.dodajSamochodOsobowy("AAA", 100, 76172361, true, "DDD", 17);
//        auta.dodajSamochodCiezarowy("CCC", 5000, 345626, false, "EEE", 430, false);
//
//        auta.wyswietlWszystkieAuta();
//
//        auta.ustawSposobSortowania(new SortujWedlugMarekPotemLiczbyKilometrow());
//        auta.posortujOrazWyswietlSamochody();
//
//        auta.ustawSposobSortowania(new SortujWedlugLiczbyKilometrow());
//        auta.posortujOrazWyswietlSamochody();
//
//        auta.wyswietlNajwiekszeZuzycie();
        Samochody auta = new Samochody();

        scanner = new Scanner(System.in);
        int wybranaOpcja = wyswietlMenu();

        while (wybranaOpcja != 0) {
            switch (wybranaOpcja) {
                case 1:
                    auta.dodajSamochodOsobowy("Fiat", 10000, 1236182736, false, "Punto", 1231);
                    auta.dodajSamochodOsobowy("AAA", 100, 76172361, true, "DDD", 17);
                    break;
                case 2:
                    auta.dodajSamochodCiezarowy("AAA", 20000, 45246136, false, "BBB", 1790, true);
                    auta.dodajSamochodCiezarowy("CCC", 5000, 345626, false, "EEE", 430, false);
                    break;
                case 3:
                    auta.wyswietlWszystkieAuta();;
                    break;
                case 4:
                    auta.ustawSposobSortowania(new SortujWedlugMarek());
                    auta.posortujOrazWyswietlSamochody();
                    break;
                case 5:
                    auta.ustawSposobSortowania(new SortujWedlugLiczbyKilometrow());
                    auta.posortujOrazWyswietlSamochody();
                    break;
                case 6:
                    auta.ustawSposobSortowania(new SortujWedlugMarekPotemLiczbyKilometrow());
                    auta.posortujOrazWyswietlSamochody();
                    break;
                case 7:
                    auta.wyswietlNajwiekszeZuzycie();
                    break;
                default:
                    System.out.println("Wybrana opcja nie istnieje");
            }

            wybranaOpcja = wyswietlMenu();
        }
    }

    private static int wyswietlMenu() {
        System.out.println("\n------Samochody------");
        System.out.println("Wybierz opcje:");
        System.out.println("1 - dodaj samochody osobowe");
        System.out.println("2 - dodaj samochody ciezarowe");
        System.out.println("3 - wyswietl auta");
        System.out.println("4 - posortuj wedlug marki");
        System.out.println("5 - posortuj wedlug liczby kilometrow");
        System.out.println("6 - posortuj wedlug marki, a potem liczby kilometrow");
        System.out.println("7 - wyswietl auto z najwiekszym zuzyciem paliwa");
        System.out.println("0 - zakoncz program");
        System.out.print("Wpisz nr opcji: ");
        return scanner.nextInt();
    }

//    private static void dodajSamochodyOsobowe() {
//        auta.dodajSamochodOsobowy("Fiat", 10000, 1236182736, false, "Punto", 1231);
//        auta.dodajSamochodOsobowy("AAA", 100, 76172361, true, "DDD", 17);
//    }
//
//    private static void dodajSamochodyCiezarowe() {
//        auta.dodajSamochodCiezarowy("AAA", 20000, 45246136, false, "BBB", 1790, true);
//        auta.dodajSamochodCiezarowy("CCC", 5000, 345626, false, "EEE", 430, false);
//    }
}
