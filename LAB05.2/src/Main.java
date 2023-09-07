import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbe elementow tablicy: ");
        int n = scanner.nextInt();
        int[] tablica = Tablica.losowaTablica(n);

        Tablica.wyswietlElementy(tablica);
        System.out.println("Wartosc minimalna w tablicy: " + Tablica.wartoscMinimalna(tablica));
        System.out.println("Iloczyn liczb nieparzystych w tablicy: " + Tablica.iloczynNieparzystych(tablica));
        System.out.println("Ilosc liczb nieparzystych w tablicy: " + Tablica.ileLiczbNieparzystych(tablica));
    }
}
